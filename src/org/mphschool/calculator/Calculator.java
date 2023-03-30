package org.mphschool.Calculator;

import java.awt.Component;
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
		ClearButton clearButton = new ClearButton();
		add(clearButton.createGuiButton());
		add(display.createGUIComponent());
		
		//DigitButton sevenButton = new DigitButton("7");
		add(new DigitButton("7").createGuiButton());
		add(new DigitButton("8").createGuiButton());
		add(new DigitButton("9").createGuiButton());
		add(new OperatorButton("+").createGuiButton());
		add(new DigitButton("4").createGuiButton());
		add(new DigitButton("5").createGuiButton());
		add(new DigitButton("6").createGuiButton());
		add(new OperatorButton("-").createGuiButton());
		add(new DigitButton("3").createGuiButton());
		add(new DigitButton("2").createGuiButton());
		add(new DigitButton("1").createGuiButton());
		add(new OperatorButton("*").createGuiButton());
		add(new DigitButton(".").createGuiButton());
		add(new DigitButton("0").createGuiButton());
		add(new EqualsButton().createGuiButton());
		add(new OperatorButton("/").createGuiButton());
		
		setSize(275, 375);
		setPreferredSize(getSize());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
}
