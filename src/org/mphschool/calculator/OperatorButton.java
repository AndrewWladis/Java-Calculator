package org.mphschool.Calculator;

public class OperatorButton extends Button {
	
	public OperatorButton(Calculator calculator, String theLabel) {
		super(calculator, theLabel);
	}

	@Override
	void handleClick(Calculator calculator) {
		calculator.operatorPressed(getLabel());
	}
}
