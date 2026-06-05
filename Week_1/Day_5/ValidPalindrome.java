//Problem: https://leetcode.com/problems/valid-palindrome/
//Description: Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//Approach: We can use two pointers, one starting from the beginning of the string and the other from the end. We will move the pointers towards each other, skipping non-alphanumeric characters, and comparing the characters at the pointers. If they are not equal, we return false. If we successfully compare all characters, we return true.
//Time complexity: O(n) 
package Week_1.Day_5;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}