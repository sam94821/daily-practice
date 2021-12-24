package com.problems.hackerrank.fibonacci;

/**
 * Problem Statement : The Fibonacci sequence appears in nature all around us,
 * in the arrangement of seeds in a sunflower and the spiral of a nautilus for
 * example.
 * 
 * The Fibonacci sequence begins with fibonacci(0) = 0 and fibonacci(1) = 1 as
 * its first and second terms. After these first two elements, each subsequent
 * element is equal to the sum of the previous two elements.
 * 
 * Programmatically:
 * 
 * fibonacci(0) = 0 
 * fibonacci(1) = 1 
 * fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
 * 
 * 
 * Given n, return the nth number in the sequence.
 * 
 * Example :
 * n = 5
 * 
 * The Fibonacci sequence to 6 is fs = [0,1,1,2,3,5,8]. With zero-based
 * indexing, fs[5] = 5.
 * 
 * Function Description :
 * 
 * Complete the recursive function fibonacci in the editor below.
 * 
 * fibonacci has the following parameter(s):
 * 
 * int n: the index of the sequence to return
 * 
 * 
 * Returns : 
 * 
 * int: the nth element in the Fibonacci sequence
 * 
 * Input Format :
 * 
 * The integer n.
 * 
 * Constraints :
 * 
 * 0<n<=30
 * ----------------------------------------------------------------------------
 * @author Sam
 * ----------------------------------------------------------------------------
 *
 */
public class FibonacciSequence {
	
	public int fibonacci(int n) {

		if(n<0 || n>30)
		{
			return -1;
		}
		
		if(n==0) {
			
			return 0;
			
		}else if(n==1) {
			
			return 1;
		}
		else
		{
			
			return (fibonacci(n-1) +fibonacci(n-2));
		}

    }

}
