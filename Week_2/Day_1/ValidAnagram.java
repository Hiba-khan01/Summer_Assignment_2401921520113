//Problem: https://leetcode.com/problems/valid-anagram/description/
//Description: Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//Approach: We can use a hash map to count the frequency of each character in the first string and then decrement the counts based on the characters in the second string. If all counts are zero at the end, then the two strings are anagrams.
//Time complexity: O(n) where n is the length of the strings.
package Week_2.Day_1;
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp = new HashMap<>();

        for(char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }

        for(char ch : t.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch,0)-1);
        }

        for(int x : mp.values()) {
            if(x != 0) return false;
        }

        return true;
    }
}
 