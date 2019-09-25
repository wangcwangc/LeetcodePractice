package practice.leetcode;

public class SumofSquareNumbers633 {
	public boolean judgeSquareSum(int c) {
		for (int i = 0; i < Math.sqrt(c) + 1; i++) {
			for (int j = i; j < Math.sqrt(c) + 1; j++) {
				if (i * i + j * j > c && i != 0)
					return false;
				if (i * i + j * j == c)
					return true;
			}
		}
		return false;
	}
}
