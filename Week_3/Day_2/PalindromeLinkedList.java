//Problem Link: https://leetcode.com/problems/palindrome-linked-list/
//Description: Given the head of a singly linked list, return true if it is a palindrome.
//Approach: We will use the fast and slow pointer technique to find the middle of the linked list. Then we will reverse the second half of the linked list and compare it with the first half to check if it is a palindrome.
//Time Complexity: O(n) where n is the length of the linked list.
package Week_3.Day_2;
import java.util.*;

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        // Compare the first half and the reversed second half
        ListNode firstHalf = head;
        ListNode secondHalf = prev;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}