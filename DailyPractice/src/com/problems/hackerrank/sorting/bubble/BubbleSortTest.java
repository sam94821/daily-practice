package com.problems.hackerrank.sorting.bubble;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BubbleSortTest {
	
	BubbleSort bubbleObject = new BubbleSort();
	
	@Test
	void sortedArray() {
	
		assertArrayEquals(new int[]{0,1,3},bubbleObject.countSwaps(new int[] {1,2,3}));
	}
	
	@Test
	void unSortedArray() {
	
		assertArrayEquals(new int[]{2,0,5},bubbleObject.countSwaps(new int[] {5,0,1}));
	}
	
	@Test
	void unSortedDuplicates() {
	
		assertArrayEquals(new int[]{8,0,7},bubbleObject.countSwaps(new int[] {5,5,7,0,5,1}));
	}

}
