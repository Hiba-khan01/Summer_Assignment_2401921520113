//Problem: https://leetcode.com/problems/spiral-matrix/
//Description: Given an m x n matrix, return all elements of the matrix in spiral order.
//Approach: We can use four pointers to keep track of the boundaries of the matrix (top, bottom, left, right). We will iterate through the matrix in a spiral manner, updating the pointers accordingly until we have traversed all elements.
//Time complexity: O(m*n) 
package Week_1.Day_4;
import java.util.ArrayList;

public class SpiralMatrix {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
