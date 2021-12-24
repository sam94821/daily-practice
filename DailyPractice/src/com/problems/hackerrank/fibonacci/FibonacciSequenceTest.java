package com.problems.hackerrank.fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciSequenceTest {

	FibonacciSequence fSObj = new FibonacciSequence();
	
	@Test
	void valueZero() {
		assertEquals(0 , fSObj.fibonacci(0));
	}
	@Test
	void valueOne() {
		
		assertEquals(1, fSObj.fibonacci(1));
	}
	
	@Test
	void valueNegative() {
		
		assertEquals(-1, fSObj.fibonacci(-5));
	}
	
	@Test
	void valueRegular() {
		
		assertEquals(13 , fSObj.fibonacci(7));
	}
	@Test
	void valueThirty() {
		
		assertEquals(832040, fSObj.fibonacci(30));
	}
	
	@Test
	void valueOutOfConstraintUpperLimit() {
		
		assertEquals(-1, fSObj.fibonacci(31));
	}
	
	@Test
	void valueOutOfConstraintLowerLimit() {
		
		assertEquals(-1, fSObj.fibonacci(-1));
	}
	
}
