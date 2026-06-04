//Problem Link: https://leetcode.com/problems/maximum-subarray/
//Description: Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//Approach: We can use Kadane's algorithm, which is an efficient way to solve this problem.
//Time Complexity: O(n)
package Week_1.Day_2;

public class MaxSubarray {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
