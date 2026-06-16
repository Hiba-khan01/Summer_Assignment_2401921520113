//Problem Link: https://leetcode.com/problems/merge-two-sorted-lists/
//Description: Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.
//Approach: we will use recursion to merge the two lists. We will compare the values of the nodes in both lists and recursively call the function to merge the remaining nodes.
//Time Complexity: O(n + m) where n and m are the lengths of the two lists.
package Week_3.Day_2;
import java.util.*;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}