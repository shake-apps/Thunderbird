package com.example.thunderbird;

import org.junit.Test;
import static org.javalite.test.jspec.JSpec.*;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
	@Test
	public void addition_isCorrect() throws Exception {
//		assertEquals(4, 2 + 2);
//		assertTrue(false);
		it(4 + 2).shouldBeEqual(6);
	}
}