package com.problems.leetcode.searchinsert;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchInsertPositionTest {

	SearchInsertPosition sipObj = new SearchInsertPosition();
	
	@Test
	void elementPresentTest() {
		
		assertEquals(2,sipObj.searchInsert(new int[] {1,3,5,6}, 5));
		
	}
	@Test
	void elementInUpperHalfTest() {
		
		assertEquals(3,sipObj.searchInsert(new int[] {1,3,5,7,8,10}, 6));
		
	}

	@Test
	void elementInLowerHalfTest() {
		
		assertEquals(1,sipObj.searchInsert(new int[] {1,3,5,6}, 2));
		
	}
	@Test
	void emptyArrayTest() {
		
		assertEquals(0,sipObj.searchInsert(new int[] {}, 3));
		
	}
	@Test
	void oneElementTest() {
		
		assertEquals(1,sipObj.searchInsert(new int[] {6}, 10));
		
	}
}
