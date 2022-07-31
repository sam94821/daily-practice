package com.problems.leetcode.llw;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
        int lengthOfWord = 0;
		
        for(int i = s.length()-1; i>0; i--) {
        	
        	if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)){
        		
        		while(s.charAt(i)!=32 && i>0)
        		{
        			lengthOfWord+=1;
        			i--;
        		}
        		break;
        	}
        	
        	
        }
		return lengthOfWord;
    }
}
