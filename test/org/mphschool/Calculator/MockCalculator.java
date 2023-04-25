package org.mphschool.Calculator;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class MockCalculator implements Calculator {

	public boolean clearWasCalled;
	public boolean digitPressedWasCalled;
	public String digitThatWasPressed;
	public boolean operatorPressedWasCalled;
	public String operatorThatWasPressed;
	public boolean calculateResultWasCalled;

	@Override
	public void clear() {
		clearWasCalled = true;
	}

	@Override
	public void digitPressed(String whichDigit) {
		digitPressedWasCalled = true;
		digitThatWasPressed = whichDigit;
	}

	@Override
	public void operatorPressed(String whichOperator) {
		operatorPressedWasCalled = true;
		operatorThatWasPressed = whichOperator;
	}

	@Override
	public void calculateResult() {
		calculateResultWasCalled = true;
	}
}
