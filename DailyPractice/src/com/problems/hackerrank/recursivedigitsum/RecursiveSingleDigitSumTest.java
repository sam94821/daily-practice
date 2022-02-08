package com.problems.hackerrank.recursivedigitsum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursiveSingleDigitSumTest {

	RecursiveSingleDigitSum rsdObj = new RecursiveSingleDigitSum();
	
	@Test
	void testGiven() {
		assertEquals(3,rsdObj.superDigit("148", 3));
	}
	
	@Test
	void singleDigitNoRepetition() {
		assertEquals(7,rsdObj.superDigit("7", 1));
	}
	
	@Test
	void singleDigitMultiRepetition() {
		
		assertEquals(6,rsdObj.superDigit("3", 5));
	}
	
	@Test
	void zeroNumber() {
		assertEquals(0,rsdObj.superDigit("0", 2));
	}
}
