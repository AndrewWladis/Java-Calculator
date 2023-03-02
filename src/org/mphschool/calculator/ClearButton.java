package org.mphschool.Calculator;

import java.awt.Color;

import javax.swing.JButton;

public class ClearButton extends Button {
	public static JButton createClearButton() {
		JButton button = Button.createGuiButton("C");
		button.setBackground(Color.red);
		return button;
	}
}
