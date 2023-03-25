package org.mphschool.Calculator;

import java.awt.Color;

import javax.swing.JButton;

public class DigitButton extends Button {
	
	public DigitButton(String thelabel) {
		super(thelabel);
	}
	
	@Override
	public JButton createGuiButton() {
		JButton button = super.createGuiButton();
		button.setBackground(Color.gray);
		return button;
	}
}
