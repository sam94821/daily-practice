package com.problems.hackerrank.sorting.bubble;

public class BubbleSort {
	
	int[] inputArray;
	
	private void displayResult() {
		
		int[] result = countSwaps(inputArray);
		System.out.println("Array is sorted in: "+result[0]);
		System.out.println("First element: "+result[1]);
		System.out.println("Last element: "+result[2]);
		
	}
	protected int[] countSwaps(int[] arrayOfNumbers) {
		
		int length = arrayOfNumbers.length;
		int numsCount = 0;
		//int temp;
		
		for(int i = 0; i < length;i++) {
			for(int j = 0; j<length-1;j++) {
				if(arrayOfNumbers[j] > arrayOfNumbers[j+1]) {		
					int temp = arrayOfNumbers[j];
					arrayOfNumbers[j] = arrayOfNumbers[j+1];
					arrayOfNumbers[j+1] = temp;
					numsCount++;
					}
			}
		}
		
		int[] result = new int[] {numsCount,arrayOfNumbers[0],arrayOfNumbers[length-1]};
		return result;
	}
}
