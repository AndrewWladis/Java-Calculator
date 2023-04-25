package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperatorButtonTest {
	private MockCalculator calculator;
	OperatorButton button = new OperatorButton(calculator, "+");

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotNull() {
		assertNotNull(button);
	}

	@Test
	void testColor() {
		assertEquals(button.createGuiButton().getBackground(), Color.blue);
	}
	
	@Test
	void testClickingTheButtonCallsClearTheCalculator() {
		JButton btn = button.createGuiButton();
		btn.doClick();
		assertTrue(calculator.operatorPressedWasCalled);
		assertEquals("+", calculator.operatorThatWasPressed)
	}
}
