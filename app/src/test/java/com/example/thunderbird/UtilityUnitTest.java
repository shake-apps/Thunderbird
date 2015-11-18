package com.example.thunderbird;
import org.junit.Test;
import static org.javalite.test.jspec.JSpec.*;

public class UtilityUnitTest {
	@Test
	public void nameConcatenator() {
		it(Utility.nameConcatenator("Colton", "Nohelty")).shouldEqual("Colton Nohelty");
	}
}
