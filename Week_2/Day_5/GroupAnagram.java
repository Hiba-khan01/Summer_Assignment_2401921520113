// Problem: https://leetcode.com/problems/group-anagrams/
// Description: Group strings that are anagrams of each other.
// Approach: Sort each string and use the sorted string as a HashMap key.
// Time Complexity: O(n * k log k)
// Space Complexity: O(n * k)
package Week_2.Day_5;
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}