//Problem Link: https://leetcode.com/problems/move-zeroes/
//Description: Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zeroes.
//Approach: Traverse the array and place all non-zero elements at the beginning using a pointer. After that, fill the remaining positions with zeroes.
//Time Complexity: O(n)
package Week_1.Day_3;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int j = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
                count++;
            }
        }

        for (int i = count; i < n; i++) {
            nums[i] = 0;
        }
    }
}
