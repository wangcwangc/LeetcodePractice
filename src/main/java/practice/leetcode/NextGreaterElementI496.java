package practice.leetcode;

import java.util.HashMap;

public class NextGreaterElementI496 {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		if (nums2.length == 0 || nums1.length == 0) {
			return new int[0];
		} else {
			HashMap<Integer, Integer> sort = new HashMap<Integer, Integer>();
			sort.put(nums2[nums2.length - 1], -1);
			for (int i = 0; i < nums2.length - 1; i++) {
				sort.put(nums2[i], -1);
				for (int j = i + 1; j < nums2.length; j++) {
					if (nums2[j] > nums2[i]) {
						sort.put(nums2[i], nums2[j]);
						break;
					}
				}
			}
			int[] result = new int[nums1.length];
			for (int i = 0; i < nums1.length; i++) {
				result[i] = sort.get(nums1[i]);
			}
			return result;
		}
	}
}
