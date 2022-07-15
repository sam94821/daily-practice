package com.problems.leetcode.searchinsert;

public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
		
		int index = 0;
		for(int i = 0; i<nums.length;i++) {
			
			if(target == nums[i])
			{
				index = i;
				//System.out.println(i);
				break;
				
			}else if(target< nums[i])
			{
				index = i;
				break;
					//System.out.println(j);
			}else if(target>nums[i])
			{
				index = i+1;
				
			}
		}		
		
		return index;
		
			/* int i=0; 
		 int j=nums.length-1;
		 
		 while(i<=j){
			 int mid = (i+j)/2;
		 
		     if(target > nums[mid]){
		         i=mid+1;
		        }else if(target < nums[mid]){
		         j=mid-1;
		        }else{
		          return mid;
		        }
		    }
		 
		    return i; */
		
		
		/*int tIndex = 0;
		int begin = 0;
		int end  = nums.length;
		int mid = nums.length/2;
	  
		for(int i = 0; i<nums.length;i++) {
			
			if(target<nums[mid])
			{
				
				end = mid -1; //1
				
				if(target<nums[end] && target>nums[begin])
				{
					tIndex = (end-1) + begin + 1 ; 
				}
				
			}
			else {
				
				begin = mid+1;
				
				if(target<nums[end-1] && target>nums[begin])
				{
					tIndex = (end-1) + begin+1;
				}
				
			}
		} return tIndex*/
	}
}
