package zanshin;

import java.awt.Component;
import java.awt.Frame;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

import atm.ATM;
import atm.physical.CustomerConsole.Cancelled;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
class AdaptationThread extends Thread {
	/** TODO: document this field. */
	private static final Logger log = new Logger(AdaptationThread.class);
	
	/** TODO: document this field. */
	private TargetSystemController controller;

	/** TODO: document this field. */
	private BlockingQueue<AdaptationAction> actionQueue;

	/** TODO: document this field. */
	private ATM atm;
	
	/** TODO: document this field. */
	private Frame frame;

	/** Constructor. */
	protected AdaptationThread(TargetSystemController controller, BlockingQueue<AdaptationAction> actionQueue) {
		this.controller = controller;
		this.actionQueue = actionQueue;
	}

	/** Setter for atm. */
	public void setAtm(ATM atm) {
		this.atm = atm;
	}

	/** Setter for frame. */
	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	/** @see java.lang.Thread#run() */
	@Override
	public void run() {
		log.info("Adaptation Thread started!");

		// Runs until interrupted.
		while (true) {
			// Takes the next adaptation action and processes it.
			try {
				AdaptationAction action = actionQueue.take();
				processAdaptationAction(action);
			}
			catch (InterruptedException e) {
				log.info("Adaptation Thread was interrupted: {0}", e.getMessage());
				break;
			}
		}

		log.info("Adaptation Thread finished!");
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param action
	 */
	private void processAdaptationAction(AdaptationAction action) {
		log.info("Adaptation Thread processing action: {0}", action);

		switch (action.getInstruction()) {
		case INITIATE:
			String reqName = action.getParams()[1].toString();
			if (AtmRequirement.T_PRINT_RECEIPT.matches(reqName))
				retryPrintReceipt();
			break;
			
		case APPLY_CONFIG:
			@SuppressWarnings("unchecked")
			Map<String, String> newConfig = (Map<String, String>)action.getParams()[0];
			if (newConfig.containsKey(AtmRequirement.NOA.getName())) {
				displayNoCashPanel(5000);
				retryWithdrawal();
			}
			break;

		case WAIT:
			long waitTime = Long.parseLong(action.getParams()[1].toString());
			displayWaitDialog(waitTime);
			break;
									
		case ABORT:
			failGracefully();
			break;

		default:
			break;
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param waitTime
	 */
	private void displayWaitDialog(long waitTime) {
		Component guiPanel = frame.getComponent(0);
		WaitPanel waitPanel = new WaitPanel(waitTime);
		frame.remove(guiPanel);
		frame.add(waitPanel);
		frame.revalidate();
		
		try {
			Thread.sleep(waitTime);
		}
		catch (InterruptedException e) {}

		frame.remove(waitPanel);
		frame.add(guiPanel);
		frame.revalidate();
	}

	
	/**
	 * TODO: document this method.
	 * 
	 * @param waitTime
	 */
	private void displayNoCashPanel(long waitTime) {
		Component guiPanel = frame.getComponent(0);
		NoCashPanel nocashPanel = new NoCashPanel(waitTime);
		frame.remove(guiPanel);
		frame.add(nocashPanel);
		frame.revalidate();
		
		try {
			Thread.sleep(waitTime);
		}
		catch (InterruptedException e) {}

		frame.remove(nocashPanel);
		frame.add(guiPanel);
		frame.revalidate();
	}
	
	/**
	 * TODO: document this method.
	 */
	private void retryPrintReceipt() {
		// Prints another message to give the user the chance of switching the ATM to normal instead of defective.
		String question = "Ready to proceed?";
		String menu[] = { "Yes", "No" };
		int answer;
		try {
			answer = atm.getCustomerConsole().readMenuChoice(question, menu);
			if (answer == 0)
				synchronized (controller) {
					
					controller.notifyAll();
				}
		}
		catch (Cancelled e) {
			log.info("User has canceled the operation during the adaptation!", e);
		}
	}

	
	/**
	 * TODO: document this method.
	 */
	private void retryWithdrawal() {
		// Prints a message to inform the user that an operator is arriving to fulfill his operation
		String question = "Would you like to wait for an operator?";
		String menu[] = { "Yes", "No" };
		int answer;
		try {
			answer = atm.getCustomerConsole().readMenuChoice(question, menu);
			if (answer == 0)
				atm.getCashDispenser().setInitialCash(controller.getLastAmount());
			else
				controller.setInAbortState(true);
			
			synchronized (controller) {
				controller.notifyAll();
			}
		}
		catch (Cancelled e) {
			log.info("User has canceled the operation during the adaptation!", e);
		}
	}
	
	/**
	 * TODO: document this method.
	 */
	private void failGracefully() {
		Component guiPanel = frame.getComponent(0);
		AbortPanel abortPanel = new AbortPanel(5000);
		frame.remove(guiPanel);
		frame.add(abortPanel);
		frame.revalidate();
		
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {}

		frame.remove(abortPanel);
		frame.add(guiPanel);
		frame.revalidate();
		
		// Notifies the ATM thread to continue, but that it should abort.
		controller.setInAbortState(true);
		synchronized (controller) {
			controller.notifyAll();
		}
	}
}
