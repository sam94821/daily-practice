package com.problems.leetcode.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz fbObj = new FizzBuzz();
	List<String> expectedAnswer;
	List<String> resultantAnswer;
	
	@Test
	void sampleFizzBuzz() {
		
		expectedAnswer = Arrays.asList(new String[] {"1","2","Fizz"});
		resultantAnswer = fbObj.fizzBuzz(3);
		
		assertEquals(expectedAnswer,resultantAnswer);
	}
	@Test
	void upperLimitFizzBuzz() {
		
		expectedAnswer = null;
		resultantAnswer = fbObj.fizzBuzz(100001);
		
		assertEquals(expectedAnswer,resultantAnswer);
	}
	@Test
	void lowerLimitFizzBuzz() {
		
		expectedAnswer = null;
		resultantAnswer = fbObj.fizzBuzz(-5);
		
		assertEquals(expectedAnswer,resultantAnswer);
	}
	
	@Test
	void allThreeFizzBuzz() {
		
		expectedAnswer = Arrays.asList(new String[] {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz",});
		resultantAnswer = fbObj.fizzBuzz(15);
		
		assertEquals(expectedAnswer,resultantAnswer);
	}
}
