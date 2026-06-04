//Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//Description: Find the maximum profit that can be earned by buying a stock on one day and selling it on a later day.
//Approach: Traverse the array once while keeping track of the minimum price seen so far. For each price, calculate the profit and update the maximum profit if it is higher.
//Time Complexity: O(n)
package Week_1.Day_1;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){

            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}
