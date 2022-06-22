package com.problems.leetcode.fizzbuzz;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
    
      if(n<1 || n>10000)
      {
    	  return null;
      }
      String[] answer  = new String[n];
      
      for(int i = 1; i<=n; i++){
          
          if(i%3 == 0 && i%5 == 0){
              
              answer[i-1] = "FizzBuzz";
          } else if(i%3 == 0) {
              answer[i-1] = "Fizz";
          } else if(i%5 == 0) {
              answer[i-1] = "Buzz";
          }else {
              answer[i-1] = Integer.toString(i);
          }        
      }
        //List<String> list = Arrays.toList
        return Arrays.asList(answer);
    }
}
