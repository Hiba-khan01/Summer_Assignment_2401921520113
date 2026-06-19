//Problem: https://leetcode.com/problems/implement-queue-using-stacks/
//Description: Implement a queue using only two stacks.
//Approach: Use one stack for insertion and another for deletion; transfer elements only when needed.
//Time Complexity: O(1) for push, O(n) for pop and peek in the worst case, but amortized O(1) for pop and peek.
package Week_3.Day_5;
import java.util.*;

class MyQueue {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public MyQueue() {
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        peek();
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}