// Problem: https://leetcode.com/problems/longest-common-prefix/
// Description: Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".
// Approach: We can start by assuming the longest common prefix is the first string in the array. Then, we iterate through the rest of the strings and compare them with the current longest common prefix. If a string does not start with the current longest common prefix, we shorten the prefix by removing the last character until we find a common prefix or it becomes empty.
// Time complexity: O(S) where S is the sum of all characters in all strings in the array.
package Week_1.Day_5;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
