package leetcode;

public class LongestCommonPrefix {
	/* 
	Write a function to find the longest common prefix string amongst an array of strings.
	If there is no common prefix, return an empty string "".
	Example:
	Input: ["flower","flow","flight"]
	Output: "fl"
	 */
	
	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		int prefix = 0;
		for (int i = 0; i< strs[0].length(); i++) {
			char temp = strs[0].charAt(i);
			int tempint = temp;
			//	int temp_comp = tempint;
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].length() <= i) {
					return strs[0].substring(0,prefix);
				}
				if (tempint != strs[j].charAt(i)) {
					return strs[0].substring(0,prefix);
				}
			}
			//sum += temp;
			prefix++;
		}
		return strs[0].substring(0,prefix);
    }
	
	public static void main(String[] args) {
		String[] testString = {"abcd","abce","abcqwer"};
		String test = longestCommonPrefix(testString); // test input -> int x
		System.out.println(test);
	}
}
