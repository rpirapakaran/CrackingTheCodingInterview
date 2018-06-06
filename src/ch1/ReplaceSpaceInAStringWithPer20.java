package ch1;

public class ReplaceSpaceInAStringWithPer20 {
	/*
	 * Write a method to replace all spaces in a string with ‘%20’.
	 */

	public String replaceSpaceByPer20(String s1) {
		String rtnStr = null;
		if (s1 == null || s1 == "")
			return s1;
		int length = s1.length();
		String perStr = "%20";
		for (int i = 0; i < length; i++) {
			String subStr = s1.substring(i, i + 1);
			if (subStr.equals(" ")) {
				if (rtnStr == null) {
					rtnStr = perStr;
				} else {
					rtnStr += perStr;
				}
			} else {
				if (rtnStr == null) {
					rtnStr = subStr;
				} else {
					rtnStr += subStr;
				}
			}

		}

		return rtnStr;

	}

	public static void main(String[] args) {
		ReplaceSpaceInAStringWithPer20 test = new ReplaceSpaceInAStringWithPer20();
		String testStr = " abc ";
		String rtnStr = test.replaceSpaceByPer20(testStr);
		System.out.println(rtnStr);

	}

}
