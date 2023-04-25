package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperatorButtonTest {
	private MockCalculator calculator;
	OperatorButton button;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new MockCalculator();
		button = new OperatorButton(calculator, "+");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotNull() {
		assertNotNull(button);
	}
	
	@Test
	void testClickingTheButtonCallsClearTheCalculator() {
		JButton btn = button.createGuiButton();
		btn.doClick();
		assertTrue(calculator.operatorPressedWasCalled);
		assertEquals("+", calculator.operatorThatWasPressed);
	}
}
