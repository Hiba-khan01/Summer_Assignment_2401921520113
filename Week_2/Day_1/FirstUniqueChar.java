//Problem: https://leetcode.com/problems/first-unique-character-in-a-string/
//Description: Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//Approach: We can use a hash map to count the frequency of each character in the string. Then, we iterate through the string again and check the frequency of each character in the hash map. The first character with a frequency of 1 is the first unique character, and we return its index.
//Time complexity: O(n) where n is the length of the string.
package Week_2.Day_1;
import java.util.HashMap;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
