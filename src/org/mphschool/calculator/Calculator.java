package org.mphschool.Calculator;

import java.util.function.BooleanSupplier;

public interface Calculator {

	void clear();
	void digitPressed(String whichDigit);
	void operatorPressed(String whichOperator);
	void calculateResult();
}
