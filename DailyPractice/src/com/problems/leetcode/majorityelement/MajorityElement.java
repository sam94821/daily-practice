package com.problems.leetcode.majorityelement;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement : Given an array nums of size n, return the majority element.
 *                     The majority element is the element that appears more 
 *                     than [n/2] times. You may assume that the majority 
 *                     element always exists in the array.
 * @author Sam
 *
 */
public class MajorityElement {
	 public int majorityElement(int[] nums) {
	 
		 int result  = 0 ;
		 int n  = nums.length;
		 Map<Integer,Integer> mapElements = new HashMap<Integer,Integer>();
		 
		 for(int i = 0; i<nums.length; i++) {
			 
			 if(mapElements.get(nums[i]) == null) {
				 
				 mapElements.put(nums[i], 1);
			 }else {
				 mapElements.put(nums[i], mapElements.get(nums[i])+ 1);
			 }
			
		 }
		 
		 for(Map.Entry<Integer,Integer> valuesMap : mapElements.entrySet()) {
			 
			 if(valuesMap.getValue() > (n/2)) {
				 
				 result = valuesMap.getKey();
			 }
		 }
		 return result;
	 }
}
