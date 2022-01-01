package com.problems.leetcode.validpalindrome;

/**
 * Problem Description : 
 * 
 * A phrase is a palindrome if, after converting all
 * uppercase letters into lowercase letters and removing all non-alphanumeric
 * characters, it reads the same forward and backward. Alphanumeric characters
 * include letters and numbers.
 *
 * ------------------------------------------------------------------------------
 * Problem Statement :
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * -----------------------------------------------------------------------------
 * Example/s :
 * 
 * 1:
 * 
 * Input: s = "A man, a plan, a canal: Panama" 
 * Output: true 
 * Explanation:
 * "amanaplanacanalpanama" is a palindrome.
 * 
 * 2 : 
 * Input: s = "race a car" 
 * Output: false 
 * Explanation: "raceacar" is not a palindrome.
 * 
 * 3 : 
 * Input: s = " " 
 * Output: true 
 * Explanation: s is an empty string "" after
 * removing non-alphanumeric characters. Since an empty string reads the same
 * forward and backward, it is a palindrome.
 * -----------------------------------------------------------------------------
 * Function Description :
 *  
 * isPalindrome(), accepts String parameter.
 * -----------------------------------------------------------------------------
 * Prints
 * 
 * N.A.
 * -----------------------------------------------------------------------------
 * Input Format :
 * 
 * N.A.
 * -----------------------------------------------------------------------------
 * Constraints
 * 
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 * -----------------------------------------------------------------------------
 * @author Sam
 * -----------------------------------------------------------------------------
 */
public class ValidPalindrome {
	
	protected boolean isPalindrome(String s) {
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		int length = s.length();
		char[] cArray = s.toCharArray();
		
		for(int i = 0; i< length/2; i++) {
			
			if(!(Character.toLowerCase(cArray[i]) == Character.toLowerCase(cArray[(length-1)-i]))) {
				
				return false;
			}
		}
		return true;
	}

}
