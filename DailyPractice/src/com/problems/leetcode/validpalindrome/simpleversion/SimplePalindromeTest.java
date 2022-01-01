package com.problems.leetcode.validpalindrome.simpleversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimplePalindromeTest {

	SimplePalindrome spObj = new SimplePalindrome();
	
	
	@Test
	void basicStringTrue() {
		
		assertEquals(true,spObj.isPalindrome("abcba"));
	}
	
	@Test
	void basicStringFalse() {
		
		assertEquals(false,spObj.isPalindrome("abdcba"));
	}
	

}
