package ch1;

import java.util.HashSet;

public class StringHasAllUniqueCharacters {

	// Problem 1:
	// Implement an algorithm to determine if a string has all unique characters.
	// What if you can not use additional data structures?

	// Using HashSet
	public boolean areAllCharactersAreUniqueWithinString(String test) {
		if (test == null) {
			return true;
		}
		char[] charArray = test.toCharArray();
		HashSet<Character> hscharset = new HashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {

			if (hscharset.contains(charArray[i])) {
				return false;
			}
			hscharset.add(charArray[i]);
		}
		return true;
	}
}
