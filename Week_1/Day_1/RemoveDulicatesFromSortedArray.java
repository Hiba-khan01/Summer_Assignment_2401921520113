//Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//Description: Remove duplicate elements from a sorted array in-place and return the number of unique elements.
//Approach: Use two pointers: one pointer (i) tracks the position for the next unique element, while the other pointer (j) scans the array. When a new unique element is found, place it at index i and increment i.
//Time Complexity: O(n)
package Week_1.Day_1;

public class RemoveDulicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j-1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i ;
    } 
}
