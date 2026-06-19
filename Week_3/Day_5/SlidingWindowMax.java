//Problem: https://leetcode.com/problems/sliding-window-maximum/
// Description: Given an array nums and a sliding window size k, return the maximum value in each sliding window.
//Approach: Use a deque to store indices of useful elements in decreasing order, keeping the maximum at the front.
// Time Complexity: O(n) since each element is added and removed from the deque at most once.
package Week_3.Day_5;
import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            // Remove indices outside current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // Store answer when first window is complete
            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}