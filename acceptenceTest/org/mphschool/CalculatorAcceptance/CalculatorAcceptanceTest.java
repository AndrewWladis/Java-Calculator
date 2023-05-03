package org.mphschool.CalculatorAcceptance;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.WindowEvent;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mphschool.Calculator.Calculator;
import org.mphschool.Calculator.SwingCalculator;

class CalculatorAcceptanceTest {

	private static SwingCalculator calculator;

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calculator = new SwingCalculator();
		calculator.launchGui();
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		calculator.dispatchEvent(new WindowEvent(calculator, WindowEvent.WINDOW_CLOSED));
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator.getButton("C").doClick();
	}

	@Test
	void testOnePlusTwoIsThree() {
		calculator.getButton("1").doClick();
		calculator.getButton("+").doClick();
		calculator.getButton("2").doClick();
		calculator.getButton("=").doClick();
		assertEquals("3", calculator.getDisplay().getGUIComponent().getText());
	}

}
