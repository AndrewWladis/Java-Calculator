package org.mphschool.Calculator;

import java.awt.Component;
import java.awt.FlowLayout;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingCalculator extends JFrame implements Calculator {
	
	public static void main(String[] args) {
		SwingCalculator calculator = new SwingCalculator();
		calculator.launchGui();
	}
	
	private Display display;
	private List<Button> buttons;
	private Map<String, JButton> guiButtons; //just 4 testing
	private String operand1 = "";
	private String operand2 = "";
	private String operator;
	private Double result;
	private Map<String, Operation> operators;

	public SwingCalculator() {
		super("Calculator");
		
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
		guiButtons = new HashMap<String, JButton>();
		operators = new HashMap<String, Operation>();
		operators.put("+", new AdditionOperation());
		operators.put("-", new SubtractionOperator());
		operators.put("*", new MultiplicationOperator());
		operators.put("/", new DivisionOperator());
		
		clear();
	}
	
	public Display getDisplay() {
		return display;
	}
	
	public void launchGui() {
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		
		JPanel row = new JPanel();
		row.add(display.getGUIComponent());
		add(row);
		for (int i = 0; i < buttons.size(); ++i) {
			JButton button = buttons.get(i).createGuiButton();
			guiButtons.put(buttons.get(i).getLabel(), button);
			row.add(button);
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
		clearFields();
		display.update("");
	}
	
	public void clearFields() {
		operand1 = "";
		operand2 = "";
		operator = "";
	}
	
	private String updateOperand(String operand, String whichDigit) {
		if (whichDigit.equals(".")) {
			if (operand.contains(".")) {
				return operand;
			}
			if (operand.isEmpty()) {
				operand = "0";
			}
		}
		
		if (operand.equals("0") && !whichDigit.equals(".")) {
			operand = whichDigit;
		} else {
			operand += whichDigit;
		}
		return operand;
	}
	
	@Override
	public void digitPressed(String whichDigit) {
		if (operator == "") {
			
			operand1 = updateOperand(operand1, whichDigit);
			display.update(operand1);
		} else {
			operand2 = updateOperand(operand2, whichDigit);
			display.update(operand2);
		}
	}

	@Override
	public void operatorPressed(String whichOperator) {
		if (!operand2.isEmpty()) {
			calculateResult();
		}
		operator = whichOperator;
		if (operand1.isEmpty()) {
			operand1 = String.valueOf(result);
		}
	}
	
	private Double round(double d) {
	    BigDecimal bd = new BigDecimal(d);
	    bd = bd.setScale(5, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	private String updateDecimalPlaces(double d) {
		String res = String.valueOf(d);
		if (res.endsWith(".0")) {
			res = res.substring(0, res.length() - 2);
        }
		return res;
	}

	@Override
	public void calculateResult() {
		Operation operation = operators.get(operator);
		try {
			result = round(operation.perform(Double.valueOf(operand1), Double.valueOf(operand2)));
			
			display.update(String.valueOf(updateDecimalPlaces(result)));
		} catch(RuntimeException e) {
			if (operand1 == "" || operand2 == "") {
				display.update("0");
			} else {
				display.update("ERR: " + e.getMessage());
			}
		}
		clearFields();
	}

	public JButton getButton(String label) {
		JButton button = guiButtons.get(label);
		return button;
	}
}
