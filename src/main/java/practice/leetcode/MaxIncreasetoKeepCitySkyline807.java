package practice.leetcode;

public class MaxIncreasetoKeepCitySkyline807 {
	public int maxIncreaseKeepingSkyline(int[][] grid) {
		int[] rows = new int[grid.length];
		int[] cols = new int[grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			int maxrow = 0;
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] > maxrow)
					maxrow = grid[i][j];
				if (grid[i][j] > cols[j])
					cols[j] = grid[i][j];
			}
			rows[i] = maxrow;
		}
		int result = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] < rows[i]) {
					result += rows[i] - grid[i][j];
					grid[i][j] = rows[i];
				}
				if (grid[i][j] > cols[j]) {
					result += cols[j] - grid[i][j];
					grid[i][j] = cols[j];
				}

			}
		}
		return result;
	}
}
