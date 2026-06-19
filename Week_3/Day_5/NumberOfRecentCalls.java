//Problem: https://leetcode.com/problems/number-of-recent-calls/
//Description: Implement a RecentCounter class to count recent requests within a time frame of 3000 milliseconds.
//Approach: Use a queue to store the timestamps of the requests and remove any timestamps that are older than 3000 milliseconds from the current request.
//Time Complexity: O(1) for each ping operation, as each timestamp is added and removed from the queue at most once.
package Week_3.Day_5;
import java.util.*;

class RecentCounter {
    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.offer(t);

        while (q.peek() < t - 3000) {
            q.poll();
        }

        return q.size();
    }
}