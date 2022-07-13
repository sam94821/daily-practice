package com.problems.leetcode.removeElements;
/**
 * 
 * @author Sam
 * 
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 */
public class RemoveElements {
	
	public int removeElement(int[] num, int val) {
	
		/*
		int count = num.length;
		
		for(int i = 0; i < num.length; i ++) {
			
			if(num[i]==val) {
				
				count--;
				
				removeElement()
			}
		}
		return count; */
		
		int i = 0;
		for(int j = 0;j<num.length;j++) {
			
			if(num[j]!=val) {
				num[i] = num[j];
				i++;
			}
		}
		return i;
		
		/*int j = 0;//for next element
		for (int i=0; i < num.length-1; i++){
			if (num[i]  != num[i+1]){
				num[j++] = num[i];
			}
		}
		num[j++] = num[num.length-1];
		return j; */
	}

}
