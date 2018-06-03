package test.ch1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch1.StringHasAllUniqueCharacters;

class StringHasAllUniqueCharactersTest {
	public StringHasAllUniqueCharacters tester;

	@BeforeEach
	public void setUpBeforeClass()
	{
		tester = new StringHasAllUniqueCharacters();
	}

	@Test
	public void testAreAllCharactersAreUniqueWithinString() {
		assertTrue(tester.areAllCharactersAreUniqueWithinString("abc"));
		assertFalse(tester.areAllCharactersAreUniqueWithinString("abca"));
		assertFalse(tester.areAllCharactersAreUniqueWithinString("abcdefa"));
		assertTrue(tester.areAllCharactersAreUniqueWithinString("a"));
		assertTrue(tester.areAllCharactersAreUniqueWithinString(""));
		assertTrue(tester.areAllCharactersAreUniqueWithinString(null));
		assertFalse(tester.areAllCharactersAreUniqueWithinString("  "));
	}

}
