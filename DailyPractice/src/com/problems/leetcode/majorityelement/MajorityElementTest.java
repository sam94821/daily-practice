package com.problems.leetcode.majorityelement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MajorityElementTest {

	MajorityElement meObj = new MajorityElement();
	
	@Test
	void basicTest() {
		assertEquals(2, meObj.majorityElement(new int[]{2,2,1,1,2,2}));
	}
	
	@Test
	void allElementsSame() {
		assertEquals(2, meObj.majorityElement(new int[]{2,2,2,2,2,2}));
	}
	
	@Test
	void noElementSatisfyingCondition() {
		assertEquals(0, meObj.majorityElement(new int[]{1,2,3,1,6,2}));
	}
	
	@Test
	void emptyArray() {
		assertEquals(0, meObj.majorityElement(new int[]{}));
	}
}
