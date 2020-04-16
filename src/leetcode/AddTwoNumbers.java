package leetcode;

public class AddTwoNumbers {
	/* 
	You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

	You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	Example:
	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	Output: 7 -> 0 -> 8
	Explanation: 342 + 465 = 807.
	*/
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyhead = new ListNode(0);
		ListNode curr = dummyhead;
		dummyhead.next = curr;
		int carry = 0;
		int next_carry = 0;
		int temp;
		while (l1 != null || l2!= null || carry != 0) {
			if (carry == 1 && l1 == null && l2 == null) {
				curr.next = new ListNode(carry);
				carry = 0;
			}
			else if (l1 == null) {
				curr.next = l2;
				if (curr.next.val + carry > 9) {
					next_carry = 1;
				}
				else {
					next_carry = 0;
				}
				curr.next.val = (curr.next.val + carry)%10;
				carry = next_carry;
				l2 = l2.next;
			}
			else if (l2 == null) {
				curr.next = l1;
				if (curr.next.val + carry > 9) {
					next_carry = 1;
				}
				else {
					next_carry = 0;
				}
				curr.next.val = (curr.next.val + carry)%10;
				carry = next_carry;
				l1 = l1.next;
			}
			else {
				temp = l1.val + l2.val + carry;
				curr.next = new ListNode(temp%10);
				carry = 0;
				if (temp > 9) {
					carry = 1;
				}
				l1 = l1.next;
				l2 = l2.next;
			}
			curr = curr.next;
		}
		return dummyhead.next;
    }
	
	public static void main(String[] args) {
		int[] test1 = {1};
		ListNode t1 = new ListNode(0);
		ListNode curr1 = t1;
		int[] test2 = {9,9};
		ListNode t2 = new ListNode(0);
		ListNode curr2 = t2;
		for (int i = 0; i < test1.length; i++) {
			curr1.next = new ListNode(test1[i]);
			curr1 = curr1.next;
		}
		for (int i = 0; i < test2.length; i++) {
			curr2.next = new ListNode(test2[i]);
			curr2 = curr2.next;
		}
		/*
		ListNode curr1_test = t1.next;
		ListNode curr2_test = t2.next;
		for (int i = 0; i < Math.max(test1.length, test2.length);i++) {
			System.out.println(curr1_test.val);
			curr1_test = curr1_test.next;
			System.out.println(curr2_test.val);
			curr2_test = curr2_test.next;
		}
		*/
		ListNode test = addTwoNumbers(t1.next,t2.next); // test input -> int x
		while (test != null) {
			System.out.println(test.val);
			test = test.next;
		}
		/*
		for (int i = 0; i < Math.max(test1.length, test2.length);i++) {
			System.out.println(test.val);
			test = test.next;
		}
		*/
	}
}
