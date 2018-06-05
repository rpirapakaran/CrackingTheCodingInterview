package ch1;

import java.util.Arrays;

public class CheckTwoStringsAreAnagrams {
	/*
	 * Write a method to decide if two strings are anagrams or not.
	 * Time Complexity: O(n)
	 */

	public boolean isPermutation(String s1, String s2) {
		if (s1 == null || s2 == null || s1.equals("") || s2.equals(""))
			return false;

		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if (a.length != b.length)
			return false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
