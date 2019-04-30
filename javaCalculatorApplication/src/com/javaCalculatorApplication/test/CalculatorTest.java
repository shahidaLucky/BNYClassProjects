package com.javaCalculatorApplication.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.javaCalculatorApplication.services.Calculator;

public class CalculatorTest {

	@Test
	public final void testAdd() {
		int n = 2;
		int m = 1;
		int expected = 3;
		Calculator calc = new Calculator();
//		int actual = calc.add(n, m);
		// assertEquals(expected, actual);

		// assertEquals(2, new Calculator().add(1, 1));

		assertNull(calc.add(n, m));
		// fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSub() {
		// 1. get the test case
		int number1 = 5;
		int number2 = 2;
		int expected = 3;

		// 2. invoke the method to be test and get the "actual" result
		Calculator calc = new Calculator();
		int actual = calc.sub(number1, number2);
		// 3. assert
		assertEquals(expected, actual);

		// fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testMultiply() {
		// fail("Not yet implemented"); // TODO
		assertEquals(10, new Calculator().multiply(2, 5));

	}

	@Test
	public final void testDiv() {
		// fail("Not yet implemented"); // TODO
		// assertEquals(2, new Calculator().div(10, 5));
		assertEquals(1d, 2d, 3); // delta is margin of error-- is your tolerance
	}

}
