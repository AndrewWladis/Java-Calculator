package org.mphschool.Calculator;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;

public class OperatorButton {
	public static JButton createOperatorButton(String input) {
		JButton button = Button.createGuiButton(input);
		button.setBackground(Color.blue);
		return button;
	}
}
