package com.problems.leetcode.palindromeNumber;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		
		String originalNum = Integer.toString(x);
		String reverse = "";
		int length = originalNum.length();
		
		for(int i = length-1;i>=0;i--) {
			
			reverse = reverse + originalNum.charAt(i);
		}
		if(originalNum.equals(reverse)) {
			return true;
		}else {
			return false;
		}
	}

}
