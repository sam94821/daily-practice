package com.problems.leetcode.pascalstriangle;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;

class PascalsTriangleTest {

	PascalsTriangle ptObj = new PascalsTriangle();
	List<List<Integer>> actual  = new ArrayList<>();
	List<List<Integer>> expected  = new ArrayList<>();
	
	public <T> List<T> twoDArrayToList(int[][] oneArray) {
	    List<T> list = new ArrayList<T>();
	    for (int[] array : oneArray) {
	        list.addAll((Collection<? extends T>) Arrays.asList(array));
	    }
	    return list;
	}
	@Test
	void zeroNumberOfRowsTest() {
		assertEquals(null,ptObj.generate(0));
	}
	
	@Test
	void oneElementTest() {
		int[][] oneArray= new int[][] {{1}};
		expected = twoDArrayToList(oneArray);
		assertEquals(expected,actual);
	}

	/*@Test
	void oneElementTest() {
		assertEquals();
	}
	
	@Test
	void oneElementTest() {
		assertEquals();
	}*/
}
