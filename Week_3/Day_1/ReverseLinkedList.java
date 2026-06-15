//Problem: https://leetcode.com/problems/reverse-linked-list/
// Description: Reverse the linked list and return the new head.
// Approach: Iteratively , here we reverse links using previous and next pointers.
// Time Complexity: O(n)
package Week_3.Day_1;
import java.util.List;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }
}