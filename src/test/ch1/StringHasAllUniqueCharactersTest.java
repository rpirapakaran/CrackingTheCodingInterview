package test.ch1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch1.StringHasAllUniqueCharacters;

class StringHasAllUniqueCharactersTest {
	public StringHasAllUniqueCharacters tester;

	@BeforeEach
	public void setUpBeforeClass() {
		tester = new StringHasAllUniqueCharacters();
	}

	@Test
	public void testAreAllCharactersAreUniqueWithinStringUsingHashSet() {
		assertTrue(tester.areAllCharactersAreUniqueWithinStringUsingSet("abc"));
		assertFalse(tester.areAllCharactersAreUniqueWithinStringUsingSet("abca"));
		assertFalse(tester.areAllCharactersAreUniqueWithinStringUsingSet("abcdefa"));
		assertTrue(tester.areAllCharactersAreUniqueWithinStringUsingSet("a"));
		assertTrue(tester.areAllCharactersAreUniqueWithinStringUsingSet(""));
		assertTrue(tester.areAllCharactersAreUniqueWithinStringUsingSet(null));
		assertFalse(tester.areAllCharactersAreUniqueWithinStringUsingSet("  "));
	}

	@Test
	public void testAreAllCharactersAreUniqueWithinStringUsingQuicksort() {
		assertTrue(tester.areAllCharactersAreUniqueWithinStringUsingQuicksort("abc"));
		assertFalse(tester.areAllCharactersAreUniqueWithinStringUsingQuicksort("abca"));
		assertFalse(tester.areAllCharactersAreUniqueWithinStringUsingQuicksort("abcdefa"));
		assertTrue(tester.areAllCharactersAreUniqueWithinStringUsingQuicksort("a"));
		assertTrue(tester.areAllCharactersAreUniqueWithinStringUsingQuicksort(""));
		assertTrue(tester.areAllCharactersAreUniqueWithinStringUsingQuicksort(null));
		assertFalse(tester.areAllCharactersAreUniqueWithinStringUsingQuicksort("  "));
	}

}
