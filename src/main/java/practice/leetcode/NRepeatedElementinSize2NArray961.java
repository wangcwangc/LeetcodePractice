package practice.leetcode;

import java.util.HashSet;

public class NRepeatedElementinSize2NArray961 {
	public int repeatedNTimes(int[] A) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int a : A) {
			if (!set.contains(a))
				set.add(a);
			else
				return a;
		}
		return 0;
	}
}
