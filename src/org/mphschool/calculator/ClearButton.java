package org.mphschool.calculator;

import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JButton;

public class ClearButton {

	public JButton createGuiButton() {
		JButton button = new JButton();
		button.setPreferredSize(new Dimension(60, 60));
		button.setMargin(new Insets(5, 5, 5, 5));
		//button.setText(input);
		return button;
	}

}
