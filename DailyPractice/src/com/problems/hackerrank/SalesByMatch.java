package com.problems.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FileName : SalesByMatch.java
 * ------------------------------------------------------
 * Problem Statement :
 * 
 * There is a large pile of socks that must be paired by
 * color. 
 * Given an array of integers representing the color of each sock,
 * determine how many pairs of socks with matching colors there are.
 * 
 * Example
 * n =7
 * ar = [1,2,1,2,1,3,2]
 * 
 * There is one pair of color 1 and one of color 2. 
 * There are three odd socks left,one of each color.
 * The number of pairs is 2.
 * 
 * Function Description
 *
 * Complete the sockMerchant function in the editor below.
 * 
 * sockMerchant has the following parameter(s):
 * 
 * int n: the number of socks in the pile 
 * int ar[n]: the colors of each sock
 * 
 * 
 * Returns
 * 
 * int: the number of pairs Input Format
 * 
 * The first line contains an integer , the number of socks represented in . The
 * second line contains space-separated integers, , the colors of the socks in
 * the pile.
 * ----------------------------------------------------------------------------
 * @author Sam
 * ----------------------------------------------------------------------------
 *
 */

public class SalesByMatch {

	    /*
	     * Complete the 'sockMerchant' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER n
	     *  2. INTEGER_ARRAY ar
	     */

	    public int sockMerchant(int n, List<Integer> ar) {
	    	
	    	int pairCount=0;
	    	Map<Integer,Integer> sockMap = new HashMap<Integer,Integer>();
	    	
	    	
	    	for(int i =0;i<n;i++) {
	    		
	    		
	    		if(sockMap.containsKey(ar.get(i))) {
	    			
	    			sockMap.put(ar.get(i),sockMap.get(ar.get(i))+1);
	    		}
	    		else {
	    			
	    			sockMap.put(ar.get(i),1);
	    		}
	    	}
	    	
	    	for(int value : sockMap.values())
	    	{
	    		value=value/2;
	    		pairCount=pairCount+value;
	    	}
	    	
	    	return pairCount;

	    }
	

}
