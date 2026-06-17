//Problem: https://leetcode.com/problems/valid-parentheses/
//Description: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. 
//Approach: We will use a stack to keep track of the opening brackets. For every closing bracket, we will check if it matches the top of the stack. If it does, we pop the stack; otherwise, we return false. At the end, if the stack is empty, the string is valid.
//Time Complexity: O(n) where n is the length of the string.
package Week_3.Day_3;
import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
