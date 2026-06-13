//Problem: String Compression
// Description: Compress consecutive repeating characters in-place.
// Approach: we Count occurrences of each character and store count after the character.
// Time Complexity: O(n)
// Space Complexity: O(1)
package Week_2.Day_5;


class Solution {
    public int compress(char[] chars) {
        int i = 0,j = 0;

        while (i < chars.length) {
            char ch = chars[i];
            int cnt = 0;

            while (i < chars.length && chars[i] == ch) {
                cnt++;
                i++;
            }

            chars[j++] = ch;

            if (cnt > 1) {
                String num = String.valueOf(cnt);

                for (char c : num.toCharArray()) {
                    chars[j++] = c;
                }
            }
        }

        return j;
    }
}
