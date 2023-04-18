package org.mphschool.Calculator;

import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class SwingCalculator extends JFrame implements Calculator {
	
	public static void main(String[] args) {
		SwingCalculator calculator = new SwingCalculator();
		calculator.launchGui();
	}
	
	private Display display;

	public SwingCalculator() {
		super("Calculator");
		display = new Display();
	}
	
	public Display getDisplay() {
		return display;
	}
	
	private void launchGui() {
		
		setLayout(new FlowLayout());
		ClearButton clearButton = new ClearButton(this);
		add(clearButton.createGuiButton());
		add(display.getGUIComponent());
		
		add(new DigitButton(this, "7").createGuiButton());
		add(new DigitButton(this, "8").createGuiButton());
		add(new DigitButton(this, "9").createGuiButton());
		add(new OperatorButton(this, "+").createGuiButton());
		add(new DigitButton(this, "4").createGuiButton());
		add(new DigitButton(this, "5").createGuiButton());
		add(new DigitButton(this,"6").createGuiButton());
		add(new OperatorButton(this, "-").createGuiButton());
		add(new DigitButton(this,"3").createGuiButton());
		add(new DigitButton(this,"2").createGuiButton());
		add(new DigitButton(this,"1").createGuiButton());
		add(new OperatorButton(this, "*").createGuiButton());
		add(new DigitButton(this,".").createGuiButton());
		add(new DigitButton(this,"0").createGuiButton());
		add(new EqualsButton().createGuiButton());
		add(new OperatorButton(this, "/").createGuiButton());
		
		setSize(275, 375);
		setPreferredSize(getSize());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

	@Override
	public void clear() {
		display.update(" ");
	}
	
	@Override
	public void digitPressed(String whichDigit) {
		digitPressedWasCalled = true;
		digit
	}
}
