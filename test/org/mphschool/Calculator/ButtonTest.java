package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mphschool.Calculator.Button;

class ButtonTest {
	Button button;

	@BeforeEach
	void setUp() throws Exception {
		button = new Button();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNotNull() {
		assertNotNull(button);
	}
	
	void testColor() {
		Button obj = new Button();
		assertNotNull(obj);
		assertTrue(obj.createGuiButton("C").getBackground() == Color.red);
	}

}
