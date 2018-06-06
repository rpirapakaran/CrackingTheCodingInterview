package test.ch1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch1.ReplaceSpaceInAStringWithPer20;

class ReplaceSpaceInAStringWithPer20Test {
	public ReplaceSpaceInAStringWithPer20 tester;

	@BeforeEach
	public void setUpBeforeClass() {
		tester = new ReplaceSpaceInAStringWithPer20();
	}

	@Test
	public void testremoveDupCharactersUsingSubstring() {
		String str1 = "abc ";
		assertTrue(tester.replaceSpaceByPer20(str1).equals("abc%20"));

		str1 = " abc ";
		assertTrue(tester.replaceSpaceByPer20(str1).equals("%20abc%20"));

		str1 = "abc";
		assertTrue(tester.replaceSpaceByPer20(str1).equals("abc"));

		str1 = " ";
		assertTrue(tester.replaceSpaceByPer20(str1).equals("%20"));

		str1 = "";
		assertTrue(tester.replaceSpaceByPer20(str1).equals(""));

		str1 = null;
		assertTrue(tester.replaceSpaceByPer20(str1) == null);

	}

}
