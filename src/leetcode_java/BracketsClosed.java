package leetcode;

public class BracketsClosed {
	/* 
	Write a function to find the longest common prefix string amongst an array of strings.
	If there is no common prefix, return an empty string "".
	Example:
	Input: ["flower","flow","flight"]
	Output: "fl"
	 */
	
	public static boolean isValid(String s) {
		char[] open = new char[s.length()];
		int open_size = 0;
		char[] open_types = {'(','{','['};
		char[] close_types = {')','}',']'};
		for (int i = 0;i < s.length();i++) {
			//System.out.println(open);
			char temp = s.charAt(i);
			if (temp == open_types[0] || temp == open_types[1] || temp == open_types[2]) {
				open[open_size++] = temp;
			}
			else if (open_size < 1) {
				return false;
			}
			else if (temp == close_types[0]) {	
				if (open[open_size - 1] == open_types[0])
					open_size--;
				else {
					return false;
				}
			}
					
			else if (temp == close_types[1]) {
				if (open[open_size - 1] == open_types[1])
					open_size--;
				else {
					return false;
				}
			}
			else if (temp == close_types[2]) {
				if (open[open_size - 1] == open_types[2])
					open_size--;
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		if (open_size == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String testString = "]";
		boolean test = isValid(testString); // test input -> int x
		System.out.println(test);
	}
}
