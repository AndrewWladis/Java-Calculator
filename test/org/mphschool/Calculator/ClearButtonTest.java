package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mphschool.calculator.ClearButton;

class ClearButtonTest {
	ClearButton button;

	@BeforeEach
	void setUp() throws Exception {
		button = new ClearButton();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotNull() {
		assertNotNull(button);
	}
	
	void testCreateGuiButtonCreatesJButton() {
		Object obj = button.createGuiButton();
		assertNotNull(obj);
		assertTrue(obj instanceof JButton);
	}

}
