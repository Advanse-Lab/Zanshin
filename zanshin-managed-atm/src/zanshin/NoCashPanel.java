package zanshin;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

/**
 * TODO: document this type.
 *
 */

	class NoCashPanel extends Panel {
		NoCashPanel(long waitTime) {
			setLayout(new GridLayout(0, 1, 0, 0));
			setFont(new Font("Monospaced", Font.PLAIN, 14));

			add(new Label("", Label.CENTER));
			add(new Label("We are very sorry...", Label.CENTER));
			add(new Label("There has been a malfunction in the ATM.", Label.CENTER));
			add(new Label("The cash dispenser is not properly charged,", Label.CENTER));
			add(new Label("We ask you to please wait for an operator", Label.CENTER));
			add(new Label("Again in " + (waitTime / 1000) + " seconds...", Label.CENTER));
			add(new Label("(This message will close automatically)", Label.CENTER));
		}
	}

