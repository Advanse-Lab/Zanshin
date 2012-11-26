import zanshin.AtmRequirement;
import zanshin.TargetSystemController;
import zanshin.ZanshinUtil;
import banking.*;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public aspect CashDisp {
	/**
	 * TODO: document this method.
	 */
	pointcut DetectCash() : 
			execution (Message getSpecificsFromCustomer());

	/**
	 * TODO: document this method.
	 */
	before(): DetectCash() {
		ZanshinUtil.logAspect(getClass(), "before", thisJoinPoint);
		
		// Logs the task has started.
		TargetSystemController controller = TargetSystemController.getInstance();
		controller.logRequirementStart(AtmRequirement.G_DETECT_CASH_AM);

	}
	
	after() throwing(): DetectCash() {
		ZanshinUtil.logAspect(getClass(), "after throwing", thisJoinPoint);

		// In case of errors, logs that the task has failed.
		TargetSystemController controller = TargetSystemController.getInstance();
		controller.logRequirementFailure(AtmRequirement.G_DETECT_CASH_AM);
		
	}
	
	
	after() returning(): DetectCash() {
		ZanshinUtil.logAspect(getClass(), "after returning", thisJoinPoint);

		// If no errors happened, logs that the task was successful.
		TargetSystemController controller = TargetSystemController.getInstance();
		controller.logRequirementSuccess(AtmRequirement.G_DETECT_CASH_AM);
	}
}
