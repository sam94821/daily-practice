package com.problems.leetcode.validpalindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

	ValidPalindrome vpObj = new ValidPalindrome();
	
	@Test
	void emptyString() {
		
		assertEquals(true,vpObj.isPalindrome(""));
	}

	@Test
	void givenInputPalindrome() {
		
		assertEquals(true,vpObj.isPalindrome("A man, a plan, a canal: Panama"));
	}
	
	@Test
	void givenInputNotPalindrome() {
		assertEquals(false,vpObj.isPalindrome("race a car"));
	}
	
	@Test
	void anotherPalindrome() {
		assertEquals(true,vpObj.isPalindrome("Amore, Roma."));
	}
	
	@Test
	void individualPalindromesAreNotPalindromeTogether() {
		// :(
		assertEquals(false, vpObj.isPalindrome("civic, radar, level"));
	}
	
	@Test
	void palindromeWithNumbers() {
		
		assertEquals(true, vpObj.isPalindrome("121 racecar//121"));
	}
	
}
