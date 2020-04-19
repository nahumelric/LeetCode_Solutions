package leetcode;

public class RemoveDuplicates {
	/* 
	Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

	Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
	Example:
	Given nums = [0,0,1,1,1,2,2,3,3,4],

	Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

	It doesn't matter what values are set beyond the returned length.
	 */
	
	public static int removeDuplicates(int[] nums) {
		//System.out.println(nums.length);
		if (nums.length == 0) {
			return 0;
		}
		int unique_num = 1;
		for (int i = 0;i < nums.length-1; i++) {
			if (nums[unique_num-1] != nums[i + 1]) {
				nums[unique_num] = nums[i + 1];
				unique_num++;
			}
		}
		return unique_num;
    }
	
	public static void main(String[] args) {
		int[] t_values = {-5,-4,-3,-3,-3};
		int test = removeDuplicates(t_values); // test input -> int x
		System.out.println(test);
	}
}
