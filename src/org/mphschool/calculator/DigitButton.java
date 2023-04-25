package org.mphschool.Calculator;


public class DigitButton extends Button {
	
	public DigitButton(Calculator calculator, String theLabel) {
		super(calculator, theLabel);
	}

	@Override
	public void handleClick(Calculator calculator) {
		calculator.digitPressed(getLabel());
	}
}
