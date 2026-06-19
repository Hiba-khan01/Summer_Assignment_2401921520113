//Problem: https://leetcode.com/problems/evaluate-reverse-polish-notation/
// Description: Evaluate an arithmetic expression using a stack.
// Approach:first, Push numbers and then apply operators on top elements.
// Time Complexity: O(n)
package Week_3.Day_4;
import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String s : tokens){

            if(s.equals("+")){
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);
            }

            else if(s.equals("-")){
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            }

            else if(s.equals("*")){
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);
            }

            else if(s.equals("/")){
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            }

            else{
                st.push(Integer.parseInt(s));
            }
        }

        return st.peek();
    }
}