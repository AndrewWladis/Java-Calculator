package org.mphschool.Calculator;

import java.awt.Color;

import javax.swing.JButton;

public class DigitButton extends Button {
	public static JButton createDigitButton(String input) {
		JButton button = Button.createGuiButton(input);
		button.setBackground(Color.blue);
		return button;
	}
}
