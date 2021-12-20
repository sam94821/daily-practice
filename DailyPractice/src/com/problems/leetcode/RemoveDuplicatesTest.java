package com.problems.leetcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class RemoveDuplicatesTest {
	
	RemoveDuplicates remDupObj = new RemoveDuplicates();
	@Test
	void basicTest() {
		assertEquals(2,remDupObj.removeDuplicates(new int[] {1,1,2}));
	}
	@Test
	void multipleNumbers()
	{
		assertEquals(5,remDupObj.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
	}
	@Test
	void withOnlyOneElementInEntireArray()
	{
		assertEquals(1,remDupObj.removeDuplicates(new int[] {0,0,0,0,0}));
	}
}
