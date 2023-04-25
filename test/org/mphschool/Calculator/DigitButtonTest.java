package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DigitButtonTest {
	
	private DigitButton button;
	private String label;
	private MockCalculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new MockCalculator();
		label ="7";
		button = new DigitButton(calculator, label);
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
		Object btn = button.createGuiButton();
		assertTrue(btn instanceof JButton);
	}
	
	@Test
	void testButtonIsCorrectSize() {
		JButton btn = button.createGuiButton();
		assertEquals(60.0, btn.getPreferredSize().getWidth(), 0.001);
		assertEquals(60.0, btn.getPreferredSize().getHeight(), 0.001);
	}
	
	@Test
	void testPressingTheButtonNotifiesTheCalculator() {
		JButton btn = button.createGuiButton();
		btn.doClick();
		
		assertTrue(calculator.digitPressedWasCalled);
	}

}
