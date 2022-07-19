package com.problems.leetcode.mergesorted;

import java.util.Arrays;

// nums1 = [1,2,3,7,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,7]
public class MergeSortedArray {
	public int[] merge(int[] nums1,int m, int[] nums2, int n) {
		
		int j = 0;
		for(int i =m; i<nums1.length;i++) {
					
				nums1[i] = nums2[j];
				j++;
		}
		
		Arrays.sort(nums1);
		
		return nums1;
	}
}
