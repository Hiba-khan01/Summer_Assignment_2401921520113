//Problem Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
//Description: Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//Approach: We can use a simple brute-force approach to check for the occurrence of needle in haystack. We iterate through haystack and for each character, we check if the subsequent characters match with needle. If we find a match, we return the starting index. If we finish iterating through haystack without finding a match, we return -1.   
//Time Complexity: O(m*n) where m is the length of haystack and n is the length of needle.
package Week_2.Day_3;

class Solution {
    public int strStr(String haystack, String needle) {
        
        if (needle.isEmpty()) {
            return 0;
        }
        
        if (needle.length() > haystack.length()) {
            return -1;
        }
        
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            
            if (j == needle.length()) {
                return i;
            }
        }
        
        return -1;
    }
}

