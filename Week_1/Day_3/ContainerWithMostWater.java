//Problem Link: https://leetcode.com/problems/container-with-most-water/
//Description: Find the maximum amount of water that can be contained between two vertical lines.
//Approach: Use two pointers at the beginning and end of the array. Calculate the area between them, update the maximum area, and move the pointer with the smaller height inward to find a potentially larger area.
//Time Complexity: O(n)
package Week_1.Day_3;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = -1;

        while(left < right){
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            
            if(currentArea > maxArea){
                maxArea = currentArea;
            }
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
