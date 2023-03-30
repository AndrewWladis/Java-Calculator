package org.mphschool.Calculator;

import java.util.function.BooleanSupplier;

public class MockCalculator implements Calculator {

	public boolean clearWasCalled;

	@Override
	public void clear() {
		clearWasCalled = true;
	}

}
