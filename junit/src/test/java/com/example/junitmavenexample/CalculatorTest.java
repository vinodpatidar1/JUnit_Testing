package com.example.junitmavenexample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private static ICalculator calculator;

	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}

	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("This is exceuted after each Test");
	}

	@Test
	public void testSum() {
		int result = calculator.sum(3, 4);

		assertEquals(7, result);
	}

	@Test
	public void testSubtraction() {
		int result = calculator.subtraction(4, 3);
		assertEquals(1, result);
	}

	@Test
	public void testMultiplication() {
		int result = calculator.multiplication(10, 5);

		assertEquals(50, result);
	}
	
	@Test
	public void testDivision() {
		int result = calculator.multiplication(10, 5);

		assertEquals(50, result);
	}
}
