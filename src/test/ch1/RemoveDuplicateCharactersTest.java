package test.ch1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch1.RemoveDuplicateCharacters;

class RemoveDuplicateCharactersTest {
	public RemoveDuplicateCharacters tester;
	public String termCharString = "\0";
	public String nullString = null;

	@BeforeEach
	public void setUpBeforeClass() {
		tester = new RemoveDuplicateCharacters();
	}

	@Test
	public void testremoveDupCharactersUsingIndexOf() {
		String str = "aab";
		assertTrue(tester.removeDupCharactersUsingIndexOf(str).equals("ab"));
		str = "abc";
		assertTrue(tester.removeDupCharactersUsingIndexOf(str).equals("abc"));

		str = "aaa";
		assertTrue(tester.removeDupCharactersUsingIndexOf(str).equals("a"));

		str = "";
		assertTrue(tester.removeDupCharactersUsingIndexOf(str).equals(""));

		str = "aaabbb";
		assertTrue(tester.removeDupCharactersUsingIndexOf(str).equals("ab"));

		str = null;
		assertTrue(tester.removeDupCharactersUsingIndexOf(str) == null);

	}

	// removeDuplicatesUsingHashset

	@Test
	public void testremoveDuplicatesUsingHashset() {
		String str = "aab";
		assertTrue(tester.removeDuplicatesUsingHashset(str).equals("ab"));
		str = "abc";
		assertTrue(tester.removeDuplicatesUsingHashset(str).equals("abc"));

		str = "aaa";
		assertTrue(tester.removeDuplicatesUsingHashset(str).equals("a"));

		str = "";
		assertTrue(tester.removeDuplicatesUsingHashset(str).equals(""));

		str = "aaabbb";
		assertTrue(tester.removeDuplicatesUsingHashset(str).equals("ab"));

		str = null;
		assertTrue(tester.removeDuplicatesUsingHashset(str) == null);

	}

}
