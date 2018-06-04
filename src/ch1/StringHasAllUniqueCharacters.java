package ch1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringHasAllUniqueCharacters {

	// Problem 1:
	// Implement an algorithm to determine if a string has all unique characters.
	// What if you can not use additional data structures?

	// Using HashSet
	public boolean areAllCharactersAreUniqueWithinStringUsingSet(String test) {
		if (test == null) {
			return true;
		}
		char[] charArray = test.toCharArray();
		Set<Character> hscharset = new HashSet<Character>();
		/*
		 * for (char c : charArray) { if (hscharset.contains(c)) { return false; }
		 * hscharset.add(c); }
		 */

		for (int i = 0; i < charArray.length; i++) {

			if (hscharset.contains(charArray[i])) {
				return false;
			}
			hscharset.add(charArray[i]);
		}

		return true;
	}

	// Using Quicksort
	public boolean areAllCharactersAreUniqueWithinStringUsingQuicksort(String test) {
		if (test == null) {
			return true;
		}
		char[] charArray = test.toCharArray();
		Arrays.sort(charArray);

		for (int i = 0; i < charArray.length - 1; i++) {
			if (charArray[i] == charArray[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
