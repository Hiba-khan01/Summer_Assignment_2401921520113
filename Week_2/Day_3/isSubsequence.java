//Problem Link: https://leetcode.com/problems/is-subsequence/
//Description: Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//Approach: The two-pointer approach iterates through both strings simultaneously, advancing the subsequence pointer only on character matches to verify order in a single pass.
//Time Complexity: O(n) where n is the length of t.
package Week_2.Day_3;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}