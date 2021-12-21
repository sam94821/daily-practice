package com.problems.hackerrank;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SalesByMatchTest {
	
	SalesByMatch salesObj = new SalesByMatch();
	
	@Test
	void emptyArray() {
		assertEquals(0,salesObj.sockMerchant(0, null));	
	}
	
	@Test
	void allDifferentNumbers() {
		
		assertEquals(0,salesObj.sockMerchant(5, new ArrayList<Integer>(Arrays.asList(1,2,3,4,5))));	
	}
	
	@Test
	void basicTest() {
		assertEquals(3,salesObj.sockMerchant(9, new ArrayList<Integer>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20))));
	}
	

}
