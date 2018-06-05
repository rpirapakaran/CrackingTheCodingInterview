package test.ch1;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch1.CheckTwoStringsAreAnagrams;

class CheckTwoStringsAreAnagramsTest {
	public CheckTwoStringsAreAnagrams tester;

	@BeforeEach
	public void setUpBeforeClass() {
		tester = new CheckTwoStringsAreAnagrams();
	}

	@Test
	public void testremoveDupCharactersUsingIndexOf() {
		String str1 = "abc";
		String str2 = "cba";
		assertTrue(tester.isPermutation(str1, str2));
		str1 = "test";
		str2 = "estt";
		assertTrue(tester.isPermutation(str1, str2));
		str1 = "testt";
		str2 = "estt";
		assertFalse(tester.isPermutation(str1, str2));
		str1 = "testme";
		str2 = "esttme";
		assertTrue(tester.isPermutation(str1, str2));
		
		str1 = "";
		str2 = "esttme";
		assertFalse(tester.isPermutation(str1, str2));
		
		str1 = "  ";
		str2 = "esttme";
		assertFalse(tester.isPermutation(str1, str2));
		
		str1 = null;
		str2 = "esttme";
		assertFalse(tester.isPermutation(str1, str2));
		
		str1 = null;
		str2 = " ";
		assertFalse(tester.isPermutation(str1, str2));
		
		str1 = null;
		str2 = null;
		assertFalse(tester.isPermutation(str1, str2));
		
		
	}

}
