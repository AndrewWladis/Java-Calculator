package org.mphschool.Calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public abstract class Button {
	
	private String label;
	private Calculator calculator;
	
	public Button(Calculator theCaculator, String theLabel) {
		label = theLabel;
		calculator = theCaculator;
	}
	
	public String getLabel() {
		return label;
	}
	
	abstract void handleClick(Calculator calculator);
	
	public JButton createGuiButton() {
		JButton button = new JButton(label);
		button.setPreferredSize(new Dimension(60, 60));
		button.setMargin(new Insets(5, 5, 5, 5));
		button.setFont(new Font("sans-serif", Font.PLAIN, 30));
		button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				handleClick(calculator);
			}
			
		});
		
		return button;
	}

}
