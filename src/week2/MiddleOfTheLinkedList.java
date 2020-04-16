package week2;

/**
 * 
@author alankrita
Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:

Input: [1,2,3,4,5]
Output: Node 3 from this list (Serialization: [3,4,5])
The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
Note that we returned a ListNode object ans, such that:
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
Example 2:

Input: [1,2,3,4,5,6]
Output: Node 4 from this list (Serialization: [4,5,6])
Since the list has two middle nodes with values 3 and 4, we return the second one.
 

Note:

The number of nodes in the given list will be between 1 and 100.
 *
 */


public class MiddleOfTheLinkedList {
	public ListNode middleNode(ListNode head) {
	    ListNode slowPtr = head;
	    ListNode fastPtr = head;
	    
	    while(fastPtr != null && fastPtr.next != null)
	    {
	        fastPtr = fastPtr.next.next;
	        slowPtr = slowPtr.next;
	    }
	    return slowPtr;
	}

	// Definition for singly-linked list.
	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	public static void main(String [] args)
	{
		ListNode node1 =  new ListNode(1);
		ListNode node2 =  new ListNode(2);
		ListNode node3 =  new ListNode(3);
		ListNode node4 =  new ListNode(4);
		ListNode node5 =  new ListNode(5);
		ListNode node6 =  new ListNode(6);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		System.out.println((new MiddleOfTheLinkedList().middleNode(node1)).val);
	}
}
