package com.problems.leetcode.palindromeNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

	PalindromeNumber pnObj = new PalindromeNumber();
	
	@Test
	void palindromeTestOne() {
		assertEquals(true,pnObj.isPalindrome(1331));
	}
	@Test
	void palindromeTestTwo() {
		assertEquals(true,pnObj.isPalindrome(131));
	}
	@Test
	void notPalindromeTest() {
		assertEquals(false,pnObj.isPalindrome(133));
	}
	@Test
	void negativeNumberTest() {
		assertEquals(false,pnObj.isPalindrome(-121));
	}
	@Test
	void singleDigitNumberTestOne() {
		assertEquals(true,pnObj.isPalindrome(1));
	}
	
	@Test
	void singleDigitNumberTestZero() {
		assertEquals(true,pnObj.isPalindrome(0));
	}
}
