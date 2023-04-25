package org.mphschool.Calculator;



public class ClearButton extends Button {
	
	
	public ClearButton(Calculator calculator) {
		super(calculator, "C");
	}
	
	@Override
	public void handleClick(Calculator calculator) {
		calculator.clear();
	}
}
