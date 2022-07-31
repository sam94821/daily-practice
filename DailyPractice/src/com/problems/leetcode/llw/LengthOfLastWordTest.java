package com.problems.leetcode.llw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LengthOfLastWordTest {

	LengthOfLastWord llwObj = new LengthOfLastWord();
	
	@Test
	void bascicTest() {
		
		assertEquals(5,llwObj.lengthOfLastWord("Hello World"));
	}

	
	@Test
	void endingWithSpaceTest() {
		
		assertEquals(4,llwObj.lengthOfLastWord("   fly me   to   the moon   "));
	}
	@Test
	void endingWithWordTest() {
		
		assertEquals(6,llwObj.lengthOfLastWord("luffy is still joyboy"));
	}
	
	@Test
	void endingWithPunctuationTest() {
		
		assertEquals(2,llwObj.lengthOfLastWord("Like so?"));
	}
	
	@Test
	void endingWithANumberTest() {
		
		assertEquals(2,llwObj.lengthOfLastWord("The number after 4 is 5."));
	}
	
}
