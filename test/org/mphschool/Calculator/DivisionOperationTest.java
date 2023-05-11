package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivisionOperationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDivisionByZeroThrowsException() {
		DivisionOperation operation = new DivisionOperation();
		try {
			operation.perform(2, 0);
			fail("Operation did not throw");
		} catch(RuntimeException e) {
			
		}
	}

}
