package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Primetest {

	@Test
	public void evaluateExpressions() {
		Prime n = new Prime();
		String sum = n.primenum(7);
		assertEquals("Prime", sum);
	}
}
