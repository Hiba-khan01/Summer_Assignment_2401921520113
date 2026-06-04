//Problem Link: https://leetcode.com/problems/reshape-the-matrix/
//Description: Convert a matrix into a new matrix with dimensions r × c while preserving the original row-wise order of elements.
//Approach: First, check if reshaping is possible by comparing the total number of elements. If possible, use index mapping to copy elements from the original matrix to the new matrix in the same order.
//Time Complexity: O(m*n) 
package Week_1.Day_4;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat; 
        }

        int[][] reshaped = new int[r][c];
        for (int i = 0; i < m * n; i++) {
            reshaped[i / c][i % c] = mat[i / n][i % n];
        }

        return reshaped;
    }
}
