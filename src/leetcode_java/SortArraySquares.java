package leetcode;

import java.util.Arrays;

public class SortArraySquares {
	/* 
	Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.Example:
	Example:
	Input: [-4,-1,0,3,10]
	Output: [0,1,9,16,100]
	 */
	
	public static int[] sortedSquares(int[] A) {
		
		int[] squares = new int[A.length];
        for (int i = 0;i < A.length;i++){
            squares[i] = A[i] * A[i];
            System.out.println(A[i]);
            System.out.println(squares[i]);
        }
        Arrays.sort(squares);
        return squares;
    }
	
	public static void main(String[] args) {
		int test_arr[] = {-4,-1,0,3,10};
		System.out.println(test_arr);
		//test_arr = {-4,-1,0,3,10};
		int[] test = sortedSquares(test_arr); // test input -> int x
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
	}
}
