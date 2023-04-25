package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EqualsButtonTest {
	private MockCalculator calculator;
	EqualsButton button;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new MockCalculator();
		button = new EqualsButton(calculator);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotNull() {
		assertNotNull(button);
	}
	
	@Test
	void testIsButton() {
		assertTrue(button.createGuiButton() instanceof JButton);
	}
	
	@Test
	void testLabel() {
		assertEquals(button.createGuiButton().getText(), "=");
	}
	
	@Test
	void testClickingTheButtonCallsNotifiesTheCalculator() {
		JButton btn = button.createGuiButton();
		btn.doClick();
		assertTrue(calculator.calculateResultWasCalled);
	}

}
