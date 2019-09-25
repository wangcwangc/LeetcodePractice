package practice.leetcode;

public class ToeplitzMatrix766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int row = i + 1;
            int col = 1;
            int num = matrix[i][0];
            while (row < matrix.length && col < matrix[0].length) {
                if (matrix[row][col] != num) {
                    return false;
                }
                row++;
                col++;
            }
        }
        for (int i = 1; i < matrix[0].length; i++) {
            int row = 1;
            int col = i + 1;
            int num = matrix[0][i];
            while (row < matrix.length && col < matrix[0].length) {
                if (matrix[row][col] != num) {
                    return false;
                }
                row++;
                col++;
            }
        }
        return true;
    }
}
