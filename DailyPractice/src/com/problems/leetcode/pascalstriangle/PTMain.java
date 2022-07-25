package com.problems.leetcode.pascalstriangle;

public class PTMain {

	public static void main(String[] args) {
		
		int numRows = 5;
		/* 1. Allocate the array holding the rows*/
		int[][] numArray = new int[numRows][];
		
		
		/* 2. Allocate the rows - Important step.*/
		for(int i = 0; i<numRows; i++) {
			/**
			 * This refers to the ith sub-array i.e
			 * the i-th row of the triangle.
			 * As j can never be larger than i, 
			 * the matrix is triangular.
			 */
			numArray[i] = new int[i+1];		
		}
		
		for(int i = 0; i<numArray.length; i++) {
			for(int j = 0; j<numArray[i].length; j++) {
				
				int numValue = 1;
				
				for(int k = 1; k<= j; k++) {
						numValue = numValue * (i-k+1)/k ;	
				}
				numArray[i][j] = numValue;		
			}
		}
				 
		
		
		/*Printing the array*/
		
		for(int[] rows : numArray) {
			for(int value : rows) {
				
				System.out.print(value);
				
			}
			System.out.println();
			
		}
	}
}
