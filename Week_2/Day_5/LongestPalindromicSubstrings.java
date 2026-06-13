// Problem: Longest Palindromic Substring
// Description: Find the longest palindrome present in the string.
// Approach: Expand around each character as a center for odd and even palindromes.
// Time Complexity: O(n²)
// Space Complexity: O(1)
package Week_2.Day_5;

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int st = 0, len = 1;

        for (int i = 0; i < n; i++) {
            int[] a = check(s, i, i);
            int[] b = check(s, i, i + 1);

            if (a[1] > len) {
                st = a[0];
                len = a[1];
            }

            if (b[1] > len) {
                st = b[0];
                len = b[1];
            }
        }

        return s.substring(st, st + len);
    }

    private int[] check(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return new int[]{l + 1, r - l - 1};
    }
}