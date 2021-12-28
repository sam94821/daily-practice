package com.problems.leetcode.plusOne;

/**
 * Filename : PlusOne.java
 * -----------------------------------------------------------------------------
 * Problem Statement :
 * 
 * You are given a large integer represented as an integer array digits, where
 * each digits[i] is the ith digit of the integer. The digits are ordered from
 * most significant to least significant in left-to-right order. The large
 * integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 * ----------------------------------------------------------------------------
 * 
 * Example 1:
 * 
 * Input: digits = [1,2,3] Output: [1,2,4]
 * 
 * Example 2:
 * 
 * Input: digits = [4,3,2,1] Output: [4,3,2,2]
 * 
 * Example 3:
 * 
 * Input: digits = [9] Output: [1,0]
 * -----------------------------------------------------------------------------
 * Constraints:
 * 
 * 1 <= digits.length <= 100 0 <= digits[i] <= 9 digits does not contain any
 * leading 0's.
 * -----------------------------------------------------------------------------
 * 
 * @author Sam
 * -----------------------------------------------------------------------------
 */

public class PlusOne {

	public int[] plusOne(int[] digits) {
		
		if(digits==null||digits.length==0)
			
	        return new int[0];
	 
	    int carry = 1;
	    
	    for(int i=digits.length-1; i>=0; i--){
	    	
	        int sum = digits[i]+carry;
	        
	        if(sum>=10){
	            carry=1;
	        }else{
	            carry=0;
	        }
	        digits[i]=sum%10;
	    }
	 
	    if(carry==1){
	        int[] result = new int[digits.length+1];
	        System.arraycopy(digits, 0, result, 1, digits.length);
	        result[0]=1;
	        return result;
	    }else{
	        
	        return digits;
	    }

		/* 
		
		int arrayLength = digits.length;
		int currentDigit;
			
		if(arrayLength==0)
		{
			resArray = null;
		}
		else
		{
			
		currentDigit= digits[digits.length-1];
		
		
		for(int i = arrayLength-1; i>=0 ; i--) {
		
			if(currentDigit==9) {
				
				if(i==0) {
					
					//
					//new array;
					//return new array
				}else {
					
					digits[i] = 0;
					
					if(digits[i-1]==9) {

						currentDigit = digits[i-1];
						digits[i-1] = digits[i-1] + 1;					
					}else {
						
						digits[i-1] = digits[i-1] + 1;
						break;
						
					}

					
				}
				//return digits;
			}else {
				
				digits[i] = digits[i] + 1;
				break;
			}
			
		}
		}
		return digits; */
	} 
}