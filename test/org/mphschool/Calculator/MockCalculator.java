package org.mphschool.Calculator;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class MockCalculator implements Calculator {

	public boolean clearWasCalled;
	public Boolean digitPressedWasCalled;
	public String digitThatWasPressed;
	public Boolean operatorPressedWasCalled;
	public String operatorThatWasPressed;

	@Override
	public void clear() {
		clearWasCalled = true;
	}

	@Override
	public void digitPressed(String whichDigit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void operatorPressed(String whichOperator) {
		operatorPressedWasCalled = true;
		operatorThatWasPressed = true;
	}

}
