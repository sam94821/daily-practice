package com.problems.leetcode.containsduplicate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

	ContainsDuplicate cdObj = new ContainsDuplicate();
	
	@Test
	void duplicateElementsPresentTest() {
		assertEquals(true,cdObj.containsDuplicate(new int[] {1,2,3,1}));
	}

	@Test
	void uniqueElementsPresentTest() {
		assertEquals(false,cdObj.containsDuplicate(new int[] {1,2,3}));
	}
	@Test
	void anotherTest() {
		assertEquals(true,cdObj.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
	}
	
	@Test
	void emptyArrayTest() {
		assertEquals(false,cdObj.containsDuplicate(new int[] {}));
	}
	
}
