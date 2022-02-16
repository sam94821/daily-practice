package com.problems.hackerrank.recursivedigitsum;

/**
 * Problem Description :
 * 
 * We define super digit of an integer x using the following rules:
 * 
 * If x has only 1 digit, then its super digit is x. 
 * Otherwise, the super digit of x is equal to the super digit of the sum of the 
 * digits of x.
 * 
 * For example, the super digit of 9875 will be calculated as:
 * 
 * super_digit(9875) 9+8+7+5 = 29 
 * super_digit(29) 2 + 9 = 11 
 * super_digit(11) 1+1 = 2 
 * super_digit(2) = 2
 * 
 * -----------------------------------------------------------------------------
 * Problem Statement : Given an integer, we need to find the super digit of the
 * integer.
 * 
 * -----------------------------------------------------------------------------
 * Example : 
 * The number p is created by concatenating the string n, k times so 
 * the initial .
 * 
 * superDigit(p) = superDigit(9875987598759875) 
 * 					9+8+7+5+9+8+7+5+9+8+7+5+9+8+7+5=116 
 * superDigit(p) = superDigit(116) 1+1+6 = 8 
 * superDigit(p) = superDigit(8)
 * All of the digits of p sum to 116. The digits of 116 sum to 8. 8is only one
 * digit, so it is the super digit.
 * -----------------------------------------------------------------------------
 * Function Description : 
 * 
 * superDigit has the following parameter(s):
 * 
 * string n: a string representation of an integer 
 * int k: the times to concatenate n to make p.
 * -----------------------------------------------------------------------------
 * Input Format : The first line contains two space separated integers n, and k.
 * -----------------------------------------------------------------------------
 * Constraints :
 * 
 * 1<= n< 10^100000 
 * 1<= k <=10^5
 * -----------------------------------------------------------------------------
 * @author Sam
 * -----------------------------------------------------------------------------
 */
public class RecursiveSingleDigitSum {
	
	public int superDigit(String n, int k) {
		
		if(k< 1 || k> Math.pow(10, 5))
		{
			return -1;
		}
		else
		{
		//repeat number
		String concatenatedNumber = new String(new char[k]).replace("\0",n);
		
		//converting string to number
		long concatenatedLongNumber = Integer.parseInt(concatenatedNumber);
		if(concatenatedLongNumber == 0)
		{
			return (int)concatenatedLongNumber;
		}
		else
		{	
		return calculateSum(concatenatedLongNumber);
		}
	}
	}
	private int calculateSum(long number) {
		
		
		if(number > 0 && number < 10)
		{
			return (int) number;
		}
		else		
		{	
				 
		long remainder = 0, sumOfDigits = 0;
		while(number>0)
		{
			remainder = number%10;
			sumOfDigits+=remainder;
			number = number/10;			
		}
		return (int)calculateSum(sumOfDigits);
		}
	}
}