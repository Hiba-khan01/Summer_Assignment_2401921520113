//Problem: https://leetcode.com/problems/ransom-note/description/
//Description: Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//Approach: we store magazine character frequencies in HashMap and reduce counts while traversing ransomNote.
// Time Complexity: O(m+n)
// Space Complexity: O(k)

package Week_2.Day_1;
import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()) return false;

        HashMap<Character,Integer> mp = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);

            if(!mp.containsKey(ch) || mp.get(ch) == 0)
                return false;

            mp.put(ch, mp.getOrDefault(ch,0) - 1);
        }

        return true;
    }
}