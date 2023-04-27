package org.mphschool.Calculator;

import java.awt.FlowLayout;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingCalculator extends JFrame implements Calculator {
	
	public static void main(String[] args) {
		SwingCalculator calculator = new SwingCalculator();
		calculator.launchGui();
	}
	
	private Display display;
	private List<Button> buttons;
	private String operand1 = "";

	public SwingCalculator() {
		super("Calculator");
		operand1 = "";
		display = new Display();
		buttons = new ArrayList<Button>();
		buttons.add(new ClearButton(this));
		buttons.add(new DigitButton(this, "7"));
		buttons.add(new DigitButton(this, "8"));
		buttons.add(new DigitButton(this, "9"));
		buttons.add(new OperatorButton(this, "+"));
		buttons.add(new DigitButton(this, "4"));
		buttons.add(new DigitButton(this, "5"));
		buttons.add(new DigitButton(this, "6"));
		buttons.add(new OperatorButton(this, "-"));
		buttons.add(new DigitButton(this, "3"));
		buttons.add(new DigitButton(this, "2"));
		buttons.add(new DigitButton(this, "1"));
		buttons.add(new OperatorButton(this, "*"));
		buttons.add(new DigitButton(this,"."));
		buttons.add(new DigitButton(this,"0"));
		buttons.add(new EqualsButton(this));
		buttons.add(new OperatorButton(this, "/"));
	}
	
	public Display getDisplay() {
		return display;
	}
	
	private void launchGui() {
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		
		JPanel row = new JPanel();
		row.add(display.getGUIComponent());
		add(row);
		for (int i = 0; i < buttons.size(); ++i) {
			Button button = buttons.get(i);
			row.add(button.createGuiButton());
			if (i % 4 == 0) {
				row = new JPanel();
				add(row);
			}
		}
		
		setSize(275, 375);
		setPreferredSize(getSize());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

	@Override
	public void clear() {
		display.update("");
	}
	
	@Override
	public void digitPressed(String whichDigit) {
		if (whichDigit.equals(".")) {
			if (operand1.contains(".")) {
				return;
			}
			if (operand1.isEmpty()) {
				operand1 = "0";
			}
		}
		
		if (operand1.equals("0") && !whichDigit.equals(".")) {
			operand1 = whichDigit;
		} else {
			operand1 += whichDigit;
		}
		
		display.update(operand1);
	}

	@Override
	public void operatorPressed(String whichOperator) {
		
	}

	@Override
	public void calculateResult() {
		// TODO Auto-generated method stub
		
	}
}
