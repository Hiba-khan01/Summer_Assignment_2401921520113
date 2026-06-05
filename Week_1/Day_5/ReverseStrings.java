//Problem: https://leetcode.com/problems/reverse-string/
//Description: Write a function that reverses a string. The input string is given as an array of characters char[].
//Approach: We can use two pointers, one starting from the beginning of the array and the other from the end. We will swap the characters at the pointers and move them towards each other until they meet.
//Time complexity: O(n) 
package Week_1.Day_5;

public class ReverseStrings {
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }

        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    
}
