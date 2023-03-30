package org.mphschool.Calculator;

import java.awt.Color;

import javax.swing.JButton;

public class ClearButton extends Button {
	
	public ClearButton(Calculator calculator) {
		super("C");
	}
	
	@Override
	public JButton createGuiButton() {
		JButton button = super.createGuiButton();
		button.setBackground(Color.red);
		return button;
	}
}
