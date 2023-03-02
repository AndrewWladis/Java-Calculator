package org.mphschool.Calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JButton;

public class Button {

	public JButton createGuiButton(String input) {
		JButton button = new JButton(input);
		button.setPreferredSize(new Dimension(60, 60));
		button.setMargin(new Insets(5, 5, 5, 5));
		//button.setText(input);
		if (input == "C") {
			button.setBackground(Color.red);
		}
		return button;
	}

}
