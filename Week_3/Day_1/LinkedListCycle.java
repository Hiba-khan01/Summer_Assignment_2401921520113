// Problem: https://leetcode.com/problems/linked-list-cycle/
// Description: Detect whether a linked list contains a cycle.
// Approach: we use slow and fast pointers (Floyd Cycle Detection).
// Time Complexity: O(n)
package Week_3.Day_1;

import java.util.List;

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        ListNode prev = head;

        while (temp != null && temp.next != null) {
            prev = prev.next;
            temp = temp.next.next;

            if (prev == temp) return true;
        }

        return false;
    }
}

