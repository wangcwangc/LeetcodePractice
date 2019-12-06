package practice.leetcode;

public class CellswithOddValuesinaMatrix1252 {
    public int oddCells(int n, int m, int[][] indices) {
        int result = 0;
        boolean[][] matrix = new boolean[n][m];
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < m; j++) {
                matrix[indices[i][0]][j] = !matrix[indices[i][0]][j];
            }
            for (int j = 0; j < n; j++) {
                matrix[j][indices[i][1]] = !matrix[j][indices[i][1]];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j]) result++;
            }
        }
        return result;
    }
}
