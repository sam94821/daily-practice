package com.problems.leetcode.plusOne;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlusOneTest {
	
	PlusOne plusObj = new PlusOne();
	int[] expectedArray;
	int[] resultArray;
	
	@Test
	void arrayWithOneElementNine() {
		
		expectedArray = new int[] {1,0};
		resultArray = plusObj.plusOne(new int[] {9});
		
		assertArrayEquals(expectedArray, resultArray);
	}

	@Test
	void arrayWithOneElementOther() {
		
		expectedArray = new int[] {8};
		resultArray = plusObj.plusOne(new int[] {7}); 
		assertArrayEquals(expectedArray, resultArray);
	}
	
	@Test
	void arrayWithRandomElements() {
		
		expectedArray = new int[] {2,3,5,6,8};
		resultArray = plusObj.plusOne(new int[] {2,3,5,6,7});
		assertArrayEquals(expectedArray, resultArray);	
	}
	
	@Test
	void arrayWithLastElementNine() {
		
		expectedArray = new int[] {1,3,0};
		resultArray = plusObj.plusOne(new int[] {1,2,9});
		assertArrayEquals(expectedArray, resultArray);
	}
	
	/*@Test
	void arrayWithAllElementsNine() {
		expectedArray = new int[] {1,0,0,0};
		resultArray = plusObj.plusOne(new int[] {9,9,9});
		assertArrayEquals(expectedArray, resultArray);
	}
	*/
	/*@Test
	void arrayWithNoElements() {
		
		expectedArray = null;
		resultArray = plusObj.plusOne(new int[] {} );
		assertArrayEquals(expectedArray, resultArray);
	}*/
	
}
