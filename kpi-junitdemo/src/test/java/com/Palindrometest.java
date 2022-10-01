package com;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Palindrometest {

	@Test
	public void evaluatesExpression() {
		Palindrome obj = new Palindrome();
		String pal = obj.palindrome(134);
		assertEquals("Palindrome", pal);
	}
}
