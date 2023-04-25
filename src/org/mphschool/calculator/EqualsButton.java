package org.mphschool.Calculator;

public class EqualsButton extends Button {

	public EqualsButton(Calculator calculator) {
		super(calculator, "=");
	}

	@Override
	void handleClick(Calculator calculator) {
		calculator.calculateResult();
	}
	
	
}
