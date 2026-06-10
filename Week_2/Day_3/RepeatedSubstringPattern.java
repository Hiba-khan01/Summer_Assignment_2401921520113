//Problem Link: https://leetcode.com/problems/repeated-substring-pattern/
//Description: Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
//Approach: The approach involves checking if the string can be formed by repeating a substring. We can iterate through possible substring lengths and check if the string can be divided evenly by that length.
//Time Complexity: O(n^2) where n is the length of the string.
package Week_2.Day_3;

class Solution {
    public boolean isRepeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n / i; j++) {
                    sb.append(substring);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}

