package com.problems.leetcode.palindromeNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

	PalindromeNumber pnObj = new PalindromeNumber();
	
	@Test
	void palindromeTest() {
		assertEquals(true,pnObj.isPalindrome(1331));
	}

	@Test
	void notPalindromeTest() {
		assertEquals(false,pnObj.isPalindrome(133));
	}
	@Test
	void negativeNumberTest() {
		assertEquals(false,pnObj.isPalindrome(-121));
	}
}
