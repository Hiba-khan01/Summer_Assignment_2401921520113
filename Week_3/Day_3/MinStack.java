//Problem: https://leetcode.com/problems/min-stack/
//Description: Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//Approach: We will use two stacks. The first stack will store all the elements, and the second stack will store the minimum elements. When we push a new element, we will check if it is smaller than or equal to the current minimum and push it onto the minStack if it is. When we pop an element, we will also pop from the minStack if the popped element is equal to the current minimum.
//Time Complexity: O(1) for all operations.
package Week_3.Day_3;
import java.util.*;

class Solution {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public Solution() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}