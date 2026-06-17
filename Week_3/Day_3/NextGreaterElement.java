//Problem: https://leetcode.com/problems/next-greater-element-i/
//Description: For each element in nums1, find the first greater element to its right in nums2. If none exists, return -1.
//Approach: We will use a monotonic decreasing stack to find the next greater element for every number in nums2, store these mappings in a HashMap, and then retrieve the answers for nums1 from the map.
//Time Complexity: O(n + m) where n is the length of nums1 and m is the length of nums2.
package Week_3.Day_3;

import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }

        return ans;
    }
}