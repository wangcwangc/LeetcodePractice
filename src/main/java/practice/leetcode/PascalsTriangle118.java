package practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> pascals = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++) {
			ArrayList<Integer> pascal = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == j)
					pascal.add(1);
				else {
					pascal.add(pascals.get(i-1).get(j)+pascals.get(i-1).get(j-1));
				}
			}
			pascals.add(pascal);
		}
		return pascals;
	}
}
