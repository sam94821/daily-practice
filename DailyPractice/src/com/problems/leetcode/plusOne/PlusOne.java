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
 *         -----------------------------------------------------------------------------
 */

public class PlusOne {

	public int[] plusOne(int[] digits) {

		int arrayLength = digits.length;

		//empty array
		if (arrayLength == 0) {

			return null;

		} else if (arrayLength == 1) {  // array with one element

			if (digits[0] == 9) {

				int[] newArray = { 1, 0 };

				return newArray;
			} else {

				digits[0] = digits[0] + 1;
			}
		}else 
		{
			if(digits[arrayLength-1]!=9) {

				digits[arrayLength-1] = digits[arrayLength-1] +1;

			}
			else {

				digits[arrayLength-2] = digits[arrayLength-2] + 1;
				digits[arrayLength-1] = 0;
				
				/*Logic for checking if the previous element is also 9 
				  yet to be written */

			}

		}

		return digits;
	}
}