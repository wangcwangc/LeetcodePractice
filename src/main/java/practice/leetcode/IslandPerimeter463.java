package practice.leetcode;

public class IslandPerimeter463 {
	public int islandPerimeter(int[][] grid) {
		int length = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 0)
					continue;
				else {
					if (i - 1 < 0)
						length++;
					else if (grid[i - 1][j] == 0)
						length++;
					if (i + 1 >= grid.length)
						length++;
					else if (grid[i + 1][j] == 0)
						length++;
					if (j - 1 < 0)
						length++;
					else if (grid[i][j - 1] == 0)
						length++;
					if (j + 1 >= grid[0].length)
						length++;
					else if (grid[i][j + 1] == 0)
						length++;
				}
			}
		}
		return length;
	}
}
