package com.problems.leetcode.validpalindrome.simpleversion;

import java.util.HashMap;
import java.util.Map;

/**
 * File name : SimplePalindrome.java
 * -------------------------------------------------
 * Check whether given string is a palindrome or not.
 * --------------------------------------------------
 * @author Sam
 * --------------------------------------------------
 */

public class SimplePalindrome {

	public boolean isPalindrome(String s) {
		
	//	Map<Character,Integer> stringMap = new HashMap<Character,Integer>();
		
		char[] cArray = s.toCharArray();
		int length = cArray.length;
		
		for(int i = 0; i<length/2;i++) {
			
			if(!(Character.toLowerCase(cArray[i]) == Character.toLowerCase(cArray[(length-1)-i]))) {
				
				return false;
			}
		}
		
		return true;
	}
}
