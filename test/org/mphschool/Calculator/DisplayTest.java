package org.mphschool.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mphschool.calculator.Display;

class DisplayTest {
	
	Display display;
	
	@BeforeEach
	void setUp() throws Exception{
		display = new Display();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testNotNull() {
		assertNotNull(display);
	}
}
