package practice.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SquaresofaSortedArray977 {
	public int[] sortedSquares(int[] A) {
		List<Integer> set = new ArrayList<Integer>();
		for (int a : A) {
			set.add(a * a);
		}
		Collections.sort(set);
		int[] result = new int[set.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = set.get(i);
		}
		return result;
	}
}
