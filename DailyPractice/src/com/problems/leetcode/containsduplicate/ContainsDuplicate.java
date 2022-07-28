package com.problems.leetcode.containsduplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem Statement : Given an integer array nums, return true if any value 
 * 					   appears at least twice in the array, and return false if 
 *                     every element is distinct.
 * @author Sam
 *
 */
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        
		Set<Integer> uniqueSet = new HashSet<Integer>();
		
		for(int i = 0; i<nums.length; i++) {
			
			if(!uniqueSet.add(nums[i]))
			{
				return true;
			}
			
		}
		return false;
    }
}
