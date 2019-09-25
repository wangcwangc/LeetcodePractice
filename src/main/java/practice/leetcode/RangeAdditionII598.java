package practice.leetcode;

public class RangeAdditionII598 {
	public int maxCount(int m, int n, int[][] ops) {
		if (ops.length == 0)
			return m * n;
		int minM = m;
		int minN = n;
		for (int row = 0; row < ops.length; row++) {
			if (ops[row][0] < minM)
				minM = ops[row][0];
			if (ops[row][1] < minN)
				minN = ops[row][1];
		}
		return minN * minM;
	}
}
