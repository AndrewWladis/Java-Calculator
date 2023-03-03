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
		
		add(DigitButton.createDigitButton("7"));
		add(DigitButton.createDigitButton("8"));
		add(DigitButton.createDigitButton("9"));
		add(OperatorButton.createOperatorButton("+"));
		add(DigitButton.createDigitButton("4"));
		add(DigitButton.createDigitButton("5"));
		add(DigitButton.createDigitButton("6"));
		add(OperatorButton.createOperatorButton("-"));
		add(DigitButton.createDigitButton("3"));
		add(DigitButton.createDigitButton("2"));
		add(DigitButton.createDigitButton("1"));
		add(OperatorButton.createOperatorButton("*"));
		add(DigitButton.createDigitButton("."));
		add(DigitButton.createDigitButton("0"));
		add(OperatorButton.createOperatorButton("="));
		add(OperatorButton.createOperatorButton("/"));
		
		setSize(275, 375);
		setPreferredSize(getSize());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
}
