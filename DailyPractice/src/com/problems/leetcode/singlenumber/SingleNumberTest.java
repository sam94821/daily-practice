package com.problems.leetcode.singlenumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingleNumberTest {

	SingleNumber snObj  = new SingleNumber();
	
	@Test
	void basicTest() {
		assertEquals(1,snObj.singleNumber(new int[] {2,2,1}));
	}

	@Test
	void singleElementOnly() {
		assertEquals(0,snObj.singleNumber(new int[] {2,2,2}));
	}
	
	@Test
	void mixedElements() {
		assertEquals(1,snObj.singleNumber(new int[] {2,2,1,3,3,5,4,4,4,4,5}));
	}
	
	@Test
	void test() {
		assertEquals(1,snObj.singleNumber(new int[] {2,2,1}));
	}
}
