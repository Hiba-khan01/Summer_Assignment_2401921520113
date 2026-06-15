// Problem: https://leetcode.com/problems/middle-of-the-linked-list/
// Description: Return the middle node of the linked list.
// Approach: we use slow and fast pointers to reach the middle.
// Time Complexity: O(n)
package Week_3.Day_1;
import java.util.List;

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}