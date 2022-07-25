package com.problems.leetcode.buysellstock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuyAndSellStockTest {

	BuyAndSellStock basObj = new BuyAndSellStock();
	
	@Test
	void basicTestOne() {
		assertEquals(5,basObj.maxProfit(new int[] {7,1,6,4,3,1}));
		
	}
	@Test
	void basicTestTwo() {
		assertEquals(0,basObj.maxProfit(new int[] {7,6,4,3,1}));
		
	}
	@Test
	void emptyArrayTest() {
		assertEquals(0,basObj.maxProfit(new int[] {}));
		
	}

}
