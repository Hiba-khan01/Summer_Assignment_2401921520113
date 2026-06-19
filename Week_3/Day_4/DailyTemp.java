//Problem: https://leetcode.com/problems/daily-temperatures/
// Description: Find how many days to wait for a warmer temperature.
// Approach: we use a stack to track unresolved temperature indices.
// Time Complexity: O(n)

package Week_3.Day_4;
import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){

            while(!st.isEmpty() &&
                    temperatures[i] > temperatures[st.peek()]){

                int idx = st.pop();
                ans[idx] = i - idx;
            }

            st.push(i);
        }

        return ans;
    }
}