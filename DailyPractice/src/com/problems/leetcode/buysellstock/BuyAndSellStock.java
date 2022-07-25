package com.problems.leetcode.buysellstock;

import java.util.Arrays;

/**
 * Problem Statement : You are given an array prices where prices[i] is the 
 *                     price of a given stock on the ith day. You want to 
 *                     maximize your profit by choosing a single day to buy one 
 *                     stock and choosing a different day in the future to sell 
 *                     that stock. Return the maximum profit you can achieve 
 *                     from this transaction. If you cannot achieve any profit, 
 *                     return 0.
 * -----------------------------------------------------------------------------
 * @author Sam
 *
 */
public class BuyAndSellStock {
	public int maxProfit(int[] prices) {
		
		if(prices==null||prices.length<=1)
	        return 0;
	 
	    int min=prices[0]; // min so far
	    int result=0;
	 
	    for(int i=1; i<prices.length; i++){
	        result = Math.max(result, prices[i]-min);
	        min = Math.min(min, prices[i]);
	    }
	 
	    return result; 
		
		/*int diff = 0;
		int[] difference  = new int[15];
		int k  =0;
		for(int i = 0;i<prices.length;i++) {
			System.out.print("Price[i] "+prices[i]+"->");
			for(int j =1 ; j<prices.length-1;j++) {
				
				if(!(prices[j]<prices[i])) {
					diff = prices[j] - prices[i];
					System.out.println(" price[j] "+prices[j]+"price[i] "+prices[i]+" Difference "+(prices[j] - prices[i]));
					difference[k] = diff;
					k++;
				}
			}
		}
		Arrays.sort(difference);
		System.out.println(Arrays.toString(difference)); 
	return difference[difference.length-1];
	*/
    }

}
