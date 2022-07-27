package com.problems.leetcode.singlenumber;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public int singleNumber(int[] nums) {
		
	
		int result = 0;
		Map<Integer,Integer> mapDuplicates = new HashMap<Integer,Integer>();
	
		for(int i= 0; i<nums.length; i++) {
		
			if(mapDuplicates.containsKey(nums[i])) {
				
				mapDuplicates.put(nums[i],mapDuplicates.get(nums[i])+1);
			}
			else {
				mapDuplicates.put(nums[i],1);
			}
		}
		
		
		if(mapDuplicates.containsValue(1)) {
			
			result = mapDuplicates.get(1);
		}
		
		return result;
	}
}
