package practice.leetcode;

import java.util.HashSet;
import java.util.Iterator;

public class IntersectionofTwoArrays349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		if (nums1.length <= nums2.length) {
			return result(nums1, nums2);
		} else {
			return result(nums2, nums1);
		}
	}

	public int[] result(int[] small, int[] big) {
		HashSet<Integer> result = new HashSet<Integer>();
		HashSet<Integer> bigs = new HashSet<Integer>();
		for (int i = 0; i < big.length; i++) {
			bigs.add(big[i]);
		}
		for (int i = 0; i < small.length; i++) {
			if (bigs.contains(small[i])) {
				bigs.remove(small[i]);
				result.add(small[i]);
			}
		}
		int[] res = new int[result.size()];
		int i = 0;
		Iterator<Integer> ite = result.iterator();
		while (ite.hasNext()) {
			res[i] = ite.next();
			i++;
		}
		return res;
	}
}
