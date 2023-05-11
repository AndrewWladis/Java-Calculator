package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubtractionOperationTest {
	SubtractionOperation operation;
	@BeforeEach
	void setUp() throws Exception {
		operation = new SubtractionOperation();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testThreeMinusTwoIsOne() {
		assertEquals(1.0, operation.perform(3.0, 2.0), 0.01);
	}

}
