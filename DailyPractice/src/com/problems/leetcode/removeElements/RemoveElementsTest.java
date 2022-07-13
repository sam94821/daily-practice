package com.problems.leetcode.removeElements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveElementsTest {

	RemoveElements reObj = new RemoveElements();
	
	@Test
	void basicTest() {
		assertEquals(5, reObj.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));	
	}
	@Test
	void allMatchingValTest() {
		assertEquals(0, reObj.removeElement(new int[] {2,2,2,2,2,2,2,2}, 2));	
	}
	
	@Test
	void firstElementMatchingValTest() {
		assertEquals(2, reObj.removeElement(new int[] {3,2,2,3}, 3));	
	}

	@Test
	void noElementMatchingValTest() {
		assertEquals(8, reObj.removeElement(new int[] {0,1,2,2,3,0,4,2}, 7));	
	}
}
