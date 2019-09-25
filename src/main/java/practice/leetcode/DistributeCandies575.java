package practice.leetcode;

import java.util.HashSet;

public class DistributeCandies575 {
	public int distributeCandies(int[] candies) {
		HashSet<Integer> result = new HashSet<Integer>(10240);
		int length = candies.length;
		for (int i = 0; i < length; i++) {
			if (!result.contains(candies[i])) {
				result.add(candies[i]);
			}
		}
		int lengthHalf = length / 2;
		if (result.size() > lengthHalf)
			return lengthHalf;
		else
			return result.size();
	}
}
