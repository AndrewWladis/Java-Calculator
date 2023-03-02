package org.mphschool.Calculator;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Calculator extends JFrame {
	
	public static void main(String[] args) {
		new Calculator();
	}

	
	public Calculator() {
		super("Calculator");
		
		Display display = new Display();
		
		setLayout(new FlowLayout());
		add(ClearButton.createClearButton());
		add(display.createGUIComponent());
		
		for (int i = 0; i < 10; i++) {
			add(DigitButton.createDigitButton(String.valueOf(i)));
		}
		
		setSize(275, 500);
		setPreferredSize(getSize());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
}
