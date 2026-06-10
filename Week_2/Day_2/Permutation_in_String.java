//Problem Link: https://leetcode.com/problems/permutation-in-string/
//Description: Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise. In other words, return true if one of s1's permutations is the substring of s2.
//Approach: We can use a sliding window approach to check for permutations of s1 in s2. We maintain two frequency arrays for characters in s1 and the current window in s2. As we slide the window, we update the frequency array for s2 and compare it with the frequency array for s1.
//Time Complexity: O(n) where n is the length of s2.
package Week_2.Day_2;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] countS1 = new int[26];
        int[] countS2 = new int[26];

        for (char ch : s1.toCharArray()) {
            countS1[ch - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            countS2[s2.charAt(i) - 'a']++;

            if (i >= s1.length()) {
                countS2[s2.charAt(i - s1.length()) - 'a']--;
            }

            if (areCountsEqual(countS1, countS2)) {
                return true;
            }
        }

        return false;
    }

    private boolean areCountsEqual(int[] countS1, int[] countS2) {
        for (int i = 0; i < 26; i++) {
            if (countS1[i] != countS2[i]) {
                return false;
            }
        }
        return true;
    }
}
