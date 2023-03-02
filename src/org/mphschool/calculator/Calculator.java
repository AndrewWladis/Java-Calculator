package org.mphschool.Calculator;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Calculator extends JFrame {
	
	public static void main(String[] args) {
		new Calculator();
	}

	
	public Calculator() {
		super("Calculator");
		
		Button clearbutton = new Button();
		add(clearbutton.createGuiButton("C"));
		
		Display display = new Display();
		
		add(display.createGUIComponent());
		
		setSize(250, 400);
		setPreferredSize(getSize());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new FlowLayout());
		setVisible(true);
		
	}
}
