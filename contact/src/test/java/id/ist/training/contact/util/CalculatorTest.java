package id.ist.training.contact.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	@Test
	void givenParamOneAndOne_whenCalculate_thenReturnTwo() {
		int result = Calculator.calculate(1, 1);
		assertEquals(2, result);
	}
	
	@Test
	void givenParamNegOneAndOne_whenCalculate_thenReturnZero() {
		int result = Calculator.calculate(-1, 1);
		assertEquals(0, result);
	}

}
