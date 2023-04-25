package org.mphschool.Calculator;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class OperatorButton extends Button {
	
	public OperatorButton(Calculator calculator, String theLabel) {
		super(calculator, theLabel);
	}
	
	@Override
	public JButton createGuiButton() {
		JButton button = super.createGuiButton();
		
		button.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				getCalculator().operatorPressed(getLabel());
			}
			
		});
		button.setBackground(Color.blue);
		return button;
	}
}
