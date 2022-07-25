package com.problems.leetcode.pascalstriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/**
 * Problem Statement : Given an integer numRows, return the first numRows of 
 * 					   Pascal's triangle.
 * ----------------------------------------------------------------------------
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * ----------------------------------------------------------------------------
 * @author Sam
 */
public class PascalsTriangle {
public <T> List<List<Integer>> generate(int numRows) {
	
	int[][] numArray = new int[numRows][];
	int[][] resultArray = null ;
	
	if(numRows == 0)
	{
		return null;
	}
	numArray[0] = new int[] {1};
	
	if(numRows == 1) {
		
		resultArray = numArray;
	}
	for(int i =1;i<numRows;i++) {
		for(int j =0;j<i+1;j++) {
			
			int[] temp = new int[j];
			int begin  =0;
			int last = temp.length-1;
			temp[begin] = 1;
			temp[last] = 1;
			
			for(int k = 1;k<j;k++) {
					
				temp[k]  = temp[begin-1] + temp[last--];
				begin--;
				last--;
			}
			
		}
	}
	List<List<Integer>> result = twoDArrayToList(resultArray);
	
	return result ;
	
    }

	public <T> List<T> twoDArrayToList(int[][] oneArray) {
		List<T> list = new ArrayList<T>();
		for (int[] array : oneArray) {
			list.addAll((Collection<? extends T>) Arrays.asList(array));
		}
    return list;
}
}
