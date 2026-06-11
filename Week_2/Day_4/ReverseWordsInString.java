// Problem: https://leetcode.com/problems/reverse-words-in-a-string-iii/
// Description: Reverse every word in the string while keeping the word order unchanged.
// Approach: here we convert string to character array and reverse each word individually.
// Time Complexity: O(n)
// Space Complexity: O(n)
package Week_2.Day_4;

class Solution {
    public String reverseWords(String s) {
        char[] a = s.toCharArray();
        int i = 0, n = a.length;

        while (i < n) {
            if (a[i] != ' ') {
                int j = i;
                while (j < n && a[j] != ' ') j++;

                reverse(a, i, j - 1);
                i = j;
            } else {
                i++;
            }
        }

        return new String(a);
    }

    void reverse(char[] a, int l, int r) {
        while (l < r) {
            char t = a[l];
            a[l++] = a[r];
            a[r--] = t;
        }
    }
}