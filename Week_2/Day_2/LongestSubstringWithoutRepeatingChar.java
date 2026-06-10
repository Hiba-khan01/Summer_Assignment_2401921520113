//Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/
//Description: Given a string s, find the length of the longest substring without repeating characters.
//Approach: We can use a sliding window approach with two pointers (left and right) to keep track of the current substring. We also use a HashSet to store the characters in the current substring. If we encounter a repeating character, we move the left pointer until we remove the duplicate character from the set.
//Time Complexity: O(n) 
package Week_2.Day_2;
import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;

        while(right < s.length()) {
            char ch = s.charAt(right);

            if(!set.contains(ch)) {
                set.add(ch);
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}