package org.mphschool.Calculator;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class MockCalculator implements Calculator {

	public boolean clearWasCalled;
	public Boolean digitPressedWasCalled;
	public Supplier<String> digitThatWasPressed;

	@Override
	public void clear() {
		clearWasCalled = true;
	}

}
