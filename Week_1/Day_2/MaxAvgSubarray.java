//Problem Link: https://leetcode.com/problems/maximum-average-subarray-i/
//Description: Find the maximum average value of any contiguous subarray of size k.
//Approach: Use the sliding window technique. Calculate the sum of the first k elements, then slide the window by adding the next element and removing the previous one, while tracking the maximum sum.
//Time Complexity: O(n)
package Week_1.Day_2;

public class MaxAvgSubarray {
    public double findMaxAverage(int[] nums, int k) {

        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return (double) maxSum / k;
    }
}
