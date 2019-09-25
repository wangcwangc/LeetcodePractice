package practice.leetcode;

public class ReshapetheMatrix566 {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if (nums.length * nums[0].length == r * c) {
			int row = 0;
			int column = 0;
			int[][] result = new int[r][c];
			for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums[0].length; j++) {
					if (column == c) {
						column = 0;
						row++;
					}
					result[row][column] = nums[i][j];
					column++;
				}
			}
			return result;
		} else
			return nums;
	}
}
