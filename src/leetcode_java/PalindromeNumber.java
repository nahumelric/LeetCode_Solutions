package leetcode;

public class PalindromeNumber {
	/* 
	Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
	Example 1:
	Input: 121
	Output: true
	 */
	
	public static boolean isPalindrome(int x) {
		int oldx = x;
		int newx = 0;
		while(oldx > 0) {
			newx = newx*10 + oldx%10;
			oldx = oldx/10;
		}
		return newx == x;
		
		/*
		 * String xString = Integer.toString(x);
		for (int i = 0; i< xString.length()/2; i++) {
			if (xString.charAt(i) != xString.charAt(xString.length() - i - 1)){
				return false;
			}
		}
		return true;
		*/
    }
	
	public static void main(String[] args) {
		boolean test = isPalindrome(15351); // test input -> int x
		System.out.println(test);
	}
}
