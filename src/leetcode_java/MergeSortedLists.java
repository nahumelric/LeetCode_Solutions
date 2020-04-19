package leetcode;

//import ListNode;

public class MergeSortedLists {
	/* 
	Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
	Example:
	Input: 1->2->4, 1->3->4
	Output: 1->1->2->3->4->4
	 */
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode sorted;// = new ListNode(Math.min(l1.val,l2.val));
		ListNode sorted_next;
		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1.val < l2.val) {
			sorted = new ListNode(l1.val);
			l1 = l1.next;
		}
		else {
			sorted = new ListNode(l2.val);
			l2 = l2.next;
		}
		while (l1.next != null || l2.next.next != null) {
			if (l1.next == null) {
				sorted.next = l2;
				l2 = l2.next;
			}
			else if (l2.next == null){
				sorted.next = l1;
				l1 = l1.next;
			}
			else {
				if (l1.val < l2.val) {
					sorted.next = l1;
					l1 = l1.next;
				}
				else {
					sorted.next = l2;
					l2 = l2.next;
				}
			}
		}
		return sorted;
	}
	public static void main(String[] args) {
		ListNode t1 = new ListNode(1);
		t1.next = new ListNode(2);
		t1.next.next = new ListNode(4);
		ListNode t2 = new ListNode(1);
		t2.next = new ListNode(3);
		t2.next.next = new ListNode(4);
		ListNode test = mergeTwoLists(t1, t2);
		System.out.println(test);
	}
}
