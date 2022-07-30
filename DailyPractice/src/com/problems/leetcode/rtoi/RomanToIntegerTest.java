package com.problems.leetcode.rtoi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

	RomanToInteger rtiObj  = new RomanToInteger();
	
	@Test
	void numeberFourTest() {
		assertEquals(4,rtiObj.romanToInt("IV"));
	}

	@Test
	void numberNineTest() {
		assertEquals(9,rtiObj.romanToInt("IX"));
	}
	
	@Test
	void numberThreeTest() {
		assertEquals(3,rtiObj.romanToInt("III"));
	}
	
	@Test
	void numberEightTest() {
		assertEquals(8,rtiObj.romanToInt("VIII"));
	}

	@Test
	void numberTenTest() {
		assertEquals(10,rtiObj.romanToInt("X"));
	}
	
	@Test
	void numberTwentySevenTest() {
		assertEquals(27,rtiObj.romanToInt("XXVII"));
	}
	
	@Test
	void numberFiftyEightTest() {
		assertEquals(58,rtiObj.romanToInt("LVIII"));
	}
	
	@Test
	void number1994Test() {
		assertEquals(1994,rtiObj.romanToInt("MCMXCIV"));
	}
	@Test
	void number3999Test() {
		assertEquals(3999,rtiObj.romanToInt("MMMCMXCIX"));
	}
}
