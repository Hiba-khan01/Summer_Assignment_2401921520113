//Problem: https://leetcode.com/problems/find-all-anagrams-in-a-string/
//Description: Given a string s and a non-empty string p, find all the start indices of p's anagrams in s. The output should be in any order.
//Approach: We can use a sliding window approach to check for anagrams of p in s. We maintain two frequency arrays for characters in p and the current window in s. As we slide the window, we update the frequency array for s and compare it with the frequency array for p. If they are equal, we add the starting index of the window to the result list.
//Time Complexity: O(n) where n is the length of s.
package Week_2.Day_2;
import java.util.ArrayList; 
import java.util.List;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] countP = new int[26];
        int[] countS = new int[26];

        for (char ch : p.toCharArray()) {
            countP[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            countS[s.charAt(i) - 'a']++;

            if (i >= p.length()) {
                countS[s.charAt(i - p.length()) - 'a']--;
            }

            if (areCountsEqual(countP, countS)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    private boolean areCountsEqual(int[] countP, int[] countS) {
        for (int i = 0; i < 26; i++) {
            if (countP[i] != countS[i]) {
                return false;
            }
        }
        return true;
    }
}