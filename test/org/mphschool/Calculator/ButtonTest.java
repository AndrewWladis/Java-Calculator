package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mphschool.Calculator.Button;

class ButtonTest {
	Button button;
	private String label;
	private MockCalculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		label = "7";
		calculator = new MockCalculator();
		button = new Button(calculator, "h");
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
		assertTrue(label, calculator.digitThatWasPressed);
	}
}
