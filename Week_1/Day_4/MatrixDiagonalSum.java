//Problem Link: https://leetcode.com/problems/matrix-diagonal-sum/
//Description: Given a square matrix mat, return the sum of the matrix diagonals.
//Approach: We can iterate through the matrix and sum the elements on both the primary diagonal (from top-left to bottom-right) and the secondary diagonal (from top-right to bottom-left). If the matrix has an odd dimension, we need to subtract the middle element once since it is counted in both diagonals.
//Time Complexity: O(n)
package Week_1.Day_4;

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];           
            sum += mat[i][n - 1 - i];  
        }

        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];  
        }

        return sum;
    }
}