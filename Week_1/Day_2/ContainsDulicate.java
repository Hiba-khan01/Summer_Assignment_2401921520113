//Problem Link: https://leetcode.com/problems/contains-duplicate/
//Description: Check whether an array contains any duplicate element.
//Approach: Use a HashSet to store elements while traversing the array. If an element is already present in the set, a duplicate exists and return true; otherwise, add it to the set.
//Time Complexity: O(n)
package Week_1.Day_2;
import java.util.*;

public class ContainsDulicate {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
