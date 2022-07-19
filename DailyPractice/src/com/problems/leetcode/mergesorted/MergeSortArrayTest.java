package com.problems.leetcode.mergesorted;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeSortArrayTest {

	MergeSortedArray msObj = new MergeSortedArray();
	
	@Test
	void basicTest() {
		assertArrayEquals(new int[]{1,2,2,3,5,6,7},
				msObj.merge(new int[] {1,2,3,6,0,0,0},4,new int[]{2,5,7},3));
	}
	@Test
	void oneElementEachTest() {
		
		assertArrayEquals(new int[]{0,1},
				msObj.merge(new int[] {0,0},1,new int[]{1},1));
	}

}
