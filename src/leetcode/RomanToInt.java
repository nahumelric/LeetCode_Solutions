package leetcode;

import java.util.Hashtable;

public class RomanToInt {
	/* 
	Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
	Example:
	Input: "MCMXCIV"
	Output: 1994
	 */
	
	public static int romanToInt(String s) {
		//Build Roman Numeral Hashtable
		Hashtable<Character, Integer> romanNumerals = 
				new Hashtable<Character, Integer>();
		romanNumerals.put('I',1);
		romanNumerals.put('V',5);
		romanNumerals.put('X',10);
		romanNumerals.put('L',50);
		romanNumerals.put('C',100);
		romanNumerals.put('D',500);
		romanNumerals.put('M',1000);
		//System.out.println(romanNumerals.get("L"));
		int sum = 0;
		int temp;
		for(int i = 0; i < s.length(); i++) {
			temp = romanNumerals.get(s.charAt(i));
			if (i < s.length() - 1 && temp < romanNumerals.get(s.charAt(i+1))) {
				temp = romanNumerals.get(s.charAt(i+1)) - temp;
				i++;
			}
			sum += temp;
		}
		return sum;
    }
	
	public static void main(String[] args) {
		int test = romanToInt("MCMXCIV"); // test input -> int x
		System.out.println(test);
	}
}
