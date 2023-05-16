package org.mphschool.Calculator;

public class DivisionOperator extends Operation {

	@Override
	public double perform(double op1, double op2) {
		if (op2 == 0) {
			throw new RuntimeException("DIV BY 0");
		}
		return op1 / op2;
	}
}
