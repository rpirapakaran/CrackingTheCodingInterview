package ch1;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {
	/*
	 * Design an algorithm and write code to remove the duplicate characters in a
	 * string without using any additional buffer. NOTE: One or two additional
	 * variables are fine. An extra copy of the array is not.
	 * 
	 * 
	 */

	public char[] removedupcharacters(char[] str) {
		// int length = str.length();
		if (str == null)
			return str;
		int length = str.length;
		if (length < 2)
			return str;
		int left = 1;

		for (int i = 1; i < length; ++i) {
			int j;
			for (j = 0; j < left; ++j) {
				if (str[i] == str[j])
					break;
			}
			if (j == left) {
				str[left] = str[i];
				++left;
			}

		}
		str[left] = 0;
		return str;

	}

	/*
	 * (Using IndexOf() method in Java) : Time Complexity: O(n)
	 * 
	 */
	public String removeDupCharactersUsingIndexOf(String s) {
		if (s == null)
			return s;
		String str = new String();
		int len = s.length();

		// loop to traverse the string and
		// check for repeating chars using
		// IndexOf() method in Java
		for (int i = 0; i < len; i++) {
			// character at i'th index of s
			char c = s.charAt(i);

			// if c is present in str, it returns
			// the index of c, else it returns -1
			if (str.indexOf(c) < 0) {
				// adding c to str if -1 is returned
				str += c;
			}
		}

		return str;

	}

	/*
	 * Function removes duplicate characters from the string using HashSet This
	 * function work in-place
	 * Time Complexity: O(n)
	 */
	public String removeDuplicatesUsingHashset(String str) {
		if (str == null || str.equals(""))
			return str;
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		String rtnStr = null;
		for (int i = 0; i < str.length(); i++)
			lhs.add(str.charAt(i));

		// print string after deleting duplicate elements
		for (Character ch : lhs) {
			if (rtnStr == null) {
				rtnStr = String.valueOf(ch);
			} else {
				rtnStr += String.valueOf(ch);
			}

			System.out.print(ch);
		}
		System.out.print(rtnStr);
		return rtnStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
