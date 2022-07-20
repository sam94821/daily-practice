package com.problems.leetcode.mergesorted;

import java.util.Arrays;

// nums1 = [1,2,3,7,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,7]
public class MergeSortedArray {
	public int[] merge(int[] nums1,int m, int[] nums2, int n) {
		
		/*int j = 0;
		for(int i =m; i<nums1.length;i++) {
					
				nums1[i] = nums2[j];
				j++;
		}
		
		Arrays.sort(nums1);
		*/
		
		int[] result = new int[m+n];
		
		int temp, j  = 0,i=0;
		result[0] = nums1[0];
		int last = result[0];
		for(int k = 1; k<result.length;k++) {
			
			while(i>n)
			{
				if(nums1[i]>=last)
				{
					result[k] = nums1[i];
					last = result[k];
				}else
				{
					temp = last;
					result[k-1] = nums1[i];
					result[k] = temp; 
					last = result[k];
				}
			i++;
			}
			
			while(j>n) {
					
				if(nums2[j]>=last) {
					result[k] = nums2[j];
					last = result[k];
				}else {
					temp = last;
					result[k-1] = nums2[j];
					result[k] = temp;
					last = result[k];
				}
			j++;
			}
		}
		for(int a : result) {
			System.out.println(a);
		}
		return result;
	}
}
