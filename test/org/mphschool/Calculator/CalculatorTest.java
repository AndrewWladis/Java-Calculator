package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	SwingCalculator calculator = new SwingCalculator();
	
	@BeforeEach
	void setUp() throws Exception {
		calculator = new SwingCalculator();
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
		Display display = calculator.getDisplay();
		display.getGUIComponent().setText("99");
		
		calculator.clear();
		assertEquals("", display.getGUIComponent().getText());
	}

}
