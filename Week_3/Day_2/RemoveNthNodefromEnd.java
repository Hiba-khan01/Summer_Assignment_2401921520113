//Problem Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//Description: Given the head of a linked list, remove the nth node from the end of the list and return its head.
//Approach: We will use two pointers to traverse the list. The first pointer will be moved n steps ahead, and then both pointers will be moved together until the first pointer reaches the end of the list. The second pointer will then point to the node before the one we want to remove, and we can adjust its next pointer to skip the nth node.
//Time Complexity: O(n) where n is the length of the list.
package Week_3.Day_2;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Move first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from the end
        second.next = second.next.next;

        return dummy.next;
    }
}