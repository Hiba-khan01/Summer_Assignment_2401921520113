//Problem Link: https://leetcode.com/problems/two-sum/
//Description: This problem requires finding two numbers in an array whose sum equals a given target and returning their indices.
//Approach: Use a HashMap to store each number and its index. For every element, check if its complement (target - current number) already exists in the map. If found, return the indices; otherwise, store the current element in the map and continue.
//Time Complexity: O(n)
package Week_1.Day_1;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}