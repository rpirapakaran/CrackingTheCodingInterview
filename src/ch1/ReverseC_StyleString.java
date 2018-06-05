package ch1;

public class ReverseC_StyleString {

	/*
	 * Write code to reverse a C-Style String. (C-String means that “abcd” is
	 * represented as five characters, including the null character.)
	 */

	public String characterreversing(String str) {
		// int length = str.length();
		if ((str == null) || str.length() < 3)
			return str;
		char[] tempArray = str.toCharArray();
		int left = 0;
		int right = str.length() - 2;
		while (left < right) {
			char temp = tempArray[left];
			tempArray[left] = tempArray[right];
			tempArray[right] = temp;
			left++;
			right--;
		}
		str = new String(tempArray);
		return str;
	}

	// Using Array index
	public String reverseStringUsingArray(String test) {
		// null string or all space or single character
		if ((test == null) || (test.trim().length() < 2) || (test.length() < 3)) {
			return test;
		}
		int length = test.length();
		char[] charArray = test.toCharArray();
		char[] reversCharArray = new char[length];
		for (int i = 0; i < length - 1; i++) {
			reversCharArray[i] = charArray[length - 2 - i];
		}
		reversCharArray[length - 1] = '\0';
		return new String(reversCharArray);
	}

	public static void main(String[] args) {

	}

}
