package org.mphschool.calculator;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Calculator extends JFrame {
	
	public static void main(String[] args) {
		new Calculator();
	}

	
	public Calculator() {
		super("Calculator");
		
		ClearButton clearbutton = new ClearButton();
		add(clearbutton.createGuiButton());
		
		setSize(400, 600);
		setPreferredSize(getSize());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new FlowLayout());
		setVisible(true);
		
	}
}
