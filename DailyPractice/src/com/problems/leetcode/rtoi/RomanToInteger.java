package com.problems.leetcode.rtoi;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	 
	public int romanToInt(String s) {
		
		char[] romanNumerals = s.toCharArray();
		//int result = 0;
		int countI = 0;
		int firstElement  = romanNumerals[0];
		Map<Character,Integer> romanMap = new HashMap<Character,Integer>();
		
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		/*if(romanNumerals.length == 1)
		{
			result = romanMap.get(romanNumerals[0]);
		}
		
		for(int i = 1; i<romanNumerals.length; i++) {
			
				if(romanMap.get(romanNumerals[i-1])<romanMap.get(romanNumerals[i])) {
				
				result = result + romanMap.get(romanNumerals[i]) - romanMap.get(romanNumerals[i-1]);
				
			}else if(romanMap.get(romanNumerals[i-1])>romanMap.get(romanNumerals[i])){
				
				result = result + romanMap.get(romanNumerals[i-1]);
				
				
			}else {
				result = result + countI;
				result = result + romanMap.get(romanNumerals[i-1]);
				countI++;
			}
			
		} */
		
		int result = romanMap.get(s.charAt(s.length()-1));
		
	    for(int i=s.length()-1;i>0;i--)
	    {
	        if(romanMap.get(s.charAt(i)) <= romanMap.get(s.charAt(i-1)))
	        {
	            result+=romanMap.get(s.charAt(i-1));
	        }
	        else
	        {
	            result-=romanMap.get(s.charAt(i-1));
	        }
	    }
		
		return result;
	}
}