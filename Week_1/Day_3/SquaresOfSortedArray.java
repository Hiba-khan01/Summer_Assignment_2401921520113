//Problem Link: https://leetcode.com/problems/squares-of-a-sorted-array/
//Description: Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//Approach: Use two pointers at the beginning and end of the array. Compare the squares of both values, place the larger square at the end of the result array, and move the corresponding pointer inward.
//Time Complexity: O(n)
package Week_1.Day_3;

class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;  
        int index = n - 1;

        while(left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare){
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
        }
        return result;
    }
}
