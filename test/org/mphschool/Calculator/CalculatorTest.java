package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	SwingCalculator calculator = new SwingCalculator();
	private Display display;
	
	@BeforeEach
	void setUp() throws Exception {
		calculator = new SwingCalculator();
		display = calculator.getDisplay();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotNull() {
		assertNotNull(calculator);
	}
	
	@Test
	void testCalculatorType() {
		assertTrue(calculator instanceof SwingCalculator);
	}
	
	@Test
	void testClearClearsTheDisplay() {
		display.getGUIComponent().setText("99");
		
		calculator.clear();
		assertEquals("", display.getGUIComponent().getText());
	}
	
	@Test
	void testPressingSingleDigitUpdatesDisplay() {
		assertEquals("", display.getGUIComponent().getText());
		
		calculator.digitPressed("7");
		assertEquals("7", display.getGUIComponent().getText());
	}
	
	@Test
	void testPressingMultipleDigitsUpdatesDisplay() {
		assertEquals("", display.getGUIComponent().getText());
		
		calculator.digitPressed("1");
		calculator.digitPressed("2");
		assertEquals("12", display.getGUIComponent().getText());
	}
	
	@Test
	void testPressingDecimalBeforeZeroAppendsZero() {
		calculator.digitPressed(".");
		assertEquals("0.", display.getGUIComponent().getText());
	}

}
