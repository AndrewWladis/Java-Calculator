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
	
	@Test
	void testFourMinusThreeEqualsOne() {
		calculator.getButton("4").doClick();
		calculator.getButton("-").doClick();
		calculator.getButton("3").doClick();
		calculator.getButton("=").doClick();
		assertEquals("1", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testFiveTimesSixEqualsThirty() {
		calculator.getButton("5").doClick();
		calculator.getButton("*").doClick();
		calculator.getButton("6").doClick();
		calculator.getButton("=").doClick();
		assertEquals("30", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testEightDividedByTwoEqualsFour() {
		calculator.getButton("8").doClick();
		calculator.getButton("/").doClick();
		calculator.getButton("2").doClick();
		calculator.getButton("=").doClick();
		assertEquals("4", calculator.getDisplay().getGUIComponent().getText());
	}
	
	@Test
	void testOnePointTwoPlusThreePointFourEqualsFourPointSix() {
		calculator.getButton("1").doClick();
		calculator.getButton(".").doClick();
		calculator.getButton("2").doClick();
		calculator.getButton("+").doClick();
		calculator.getButton("3").doClick();
		calculator.getButton(".").doClick();
		calculator.getButton("4").doClick();
		calculator.getButton("=").doClick();
		assertEquals("4.6", calculator.getDisplay().getGUIComponent().getText());
	}
	
	
	@Test
	void testFivePointSixSevenMinusOneEqualsFourPointSixSeven() {
		calculator.getButton("5").doClick();
		calculator.getButton(".").doClick();
		calculator.getButton("6").doClick();
		calculator.getButton("7").doClick();
		calculator.getButton("-").doClick();
		calculator.getButton("1").doClick();
		calculator.getButton("=").doClick();
		assertEquals("4.67", calculator.getDisplay().getGUIComponent().getText());
	}
	

	@Test
	void testSevenPointThreeTimesEightPointNineEqualsSixtyFourPointNineSeven() {
		calculator.getButton("7").doClick();
		calculator.getButton(".").doClick();
		calculator.getButton("3").doClick();
		calculator.getButton("*").doClick();
		calculator.getButton("8").doClick();
		calculator.getButton(".").doClick();
		calculator.getButton("9").doClick();
		calculator.getButton("=").doClick();
		assertEquals("64.97", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testFourDividedByThreeEqualsOnePointThreeThreeThreeThreeThree() {
		calculator.getButton("4").doClick();
		calculator.getButton("/").doClick();
		calculator.getButton("3").doClick();
		calculator.getButton("=").doClick();
		assertEquals("1.33333", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testEightDividedByThreeEqualsTwoPointSixSixSixSixSix() {
		calculator.getButton("8").doClick();
		calculator.getButton("/").doClick();
		calculator.getButton("3").doClick();
		calculator.getButton("=").doClick();
		assertEquals("2.66667", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testOnePlusTwoPlusThreeEqualsSix() {
		calculator.getButton("1").doClick();
		calculator.getButton("+").doClick();
		calculator.getButton("2").doClick();
		calculator.getButton("+").doClick();
		calculator.getButton("3").doClick();
		calculator.getButton("=").doClick();
		assertEquals("6", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testOnePlusTwoPlusThreeEqualsSixAlternateStyle() {
		calculator.getButton("1").doClick();
		calculator.getButton("+").doClick();
		calculator.getButton("2").doClick();
		calculator.getButton("=").doClick();
		calculator.getButton("+").doClick();
		calculator.getButton("3").doClick();
		calculator.getButton("=").doClick();
		assertEquals("6", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testFivePlusMultiplyNineEqualsFortyFive() {
		calculator.getButton("5").doClick();
		calculator.getButton("+").doClick();
		calculator.getButton("*").doClick();
		calculator.getButton("9").doClick();
		calculator.getButton("=").doClick();
		assertEquals("45", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testOnePlusTwoClearThreePlusFourEqualsSeven() {
		calculator.getButton("1").doClick();
		calculator.getButton("+").doClick();
		calculator.getButton("2").doClick();
		calculator.getButton("C").doClick();
		calculator.getButton("3").doClick();
		calculator.getButton("+").doClick();
		calculator.getButton("4").doClick();
		calculator.getButton("=").doClick();
		assertEquals("7", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testPointOneEqualsZeroPointOne() {
		calculator.getButton(".").doClick();
		calculator.getButton("1").doClick();
		assertEquals("0.1", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testOneTwoThreeMinusNineEightEqualsTwentyFive() {
		calculator.getButton("1").doClick();
		calculator.getButton("2").doClick();
		calculator.getButton("3").doClick();
		calculator.getButton("-").doClick();
		calculator.getButton("9").doClick();
		calculator.getButton("8").doClick();
		calculator.getButton("=").doClick();
		assertEquals("25", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testPlusTenEqualsTen() {
		calculator.getButton("+").doClick();
		calculator.getButton("1").doClick();
		calculator.getButton("0").doClick();
		calculator.getButton("=").doClick();
		assertEquals("10", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testMultiplySevenEqualsZero() {
		calculator.getButton("*").doClick();
		calculator.getButton("7").doClick();
		calculator.getButton("=").doClick();
		assertEquals("0", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testSevenMultiplyEqualsZero() {
		calculator.getButton("7").doClick();
		calculator.getButton("*").doClick();
		calculator.getButton("=").doClick();
		assertEquals("0", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testSevenDividedByZeroThrowsError() {
		calculator.getButton("7").doClick();
		calculator.getButton("/").doClick();
		calculator.getButton("0").doClick();
		calculator.getButton("=").doClick();
		assertEquals("ERR: DIV BY 0", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testZeroDividedBySevenEqualsZero() {
		calculator.getButton("0").doClick();
		calculator.getButton("/").doClick();
		calculator.getButton("7").doClick();
		calculator.getButton("=").doClick();
		assertEquals("0", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testEqualsButtonWithoutInputEqualsZero() {
		calculator.getButton("=").doClick();
		assertEquals("0", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testFiftyTwoMinusSixtySevenEqualsNegativeFifteen() {
		calculator.getButton("5").doClick();
		calculator.getButton("2").doClick();
		calculator.getButton("-").doClick();
		calculator.getButton("6").doClick();
		calculator.getButton("7").doClick();
		calculator.getButton("=").doClick();
		assertEquals("-15", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testSeventeenMinusThirtyFourPlusFiftyTwoMultiplyTwentyOneEqualsOneHundredNinetyTwentyFive() {
		calculator.getButton("1").doClick();
		calculator.getButton("7").doClick();
		calculator.getButton("-").doClick();
		calculator.getButton("3").doClick();
		calculator.getButton("4").doClick();
		calculator.getButton("+").doClick();
		calculator.getButton("5").doClick();
		calculator.getButton("2").doClick();
		calculator.getButton("*").doClick();
		calculator.getButton("2").doClick();
		calculator.getButton("1").doClick();
		calculator.getButton("=").doClick();
		calculator.getButton("+").doClick();
		calculator.getButton("2").doClick();
		calculator.getButton("6").doClick();
		calculator.getButton("=").doClick();
		calculator.getButton("*").doClick();
		calculator.getButton("2").doClick();
		calculator.getButton("5").doClick();
		calculator.getButton("=").doClick();
		assertEquals("19025", calculator.getDisplay().getGUIComponent().getText());
	}

	@Test
	void testTwentyFiveMultiplyFourEqualsThirtyTwoMinusNineEqualsTwentyOne() {
		calculator.getButton("2").doClick();
		calculator.getButton("5").doClick();
		calculator.getButton("*").doClick();
		calculator.getButton("4").doClick();
		calculator.getButton("=").doClick();
		calculator.getButton("3").doClick();
		calculator.getButton("2").doClick();
		calculator.getButton("-").doClick();
		calculator.getButton("9").doClick();
		calculator.getButton("=").doClick();
		assertEquals("21", calculator.getDisplay().getGUIComponent().getText());
	}


}
