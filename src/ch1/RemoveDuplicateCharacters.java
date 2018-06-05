package ch1;

public class RemoveDuplicateCharacters {
/*
 * Design an algorithm and write code to remove the duplicate characters in a string 
 * without using any additional buffer. NOTE: One or two additional variables are fine. 
 * An extra copy of the array is not.
 * 
 * 
 */
	
	public String removedupcharacters(String str) {
		//	int length = str.length();
			if (str.length() < 3)
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
