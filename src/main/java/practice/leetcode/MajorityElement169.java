package practice.leetcode;

import java.util.HashMap;

public class MajorityElement169 {
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (result.containsKey(nums[i])) {
				result.replace(nums[i], result.get(nums[i]) + 1);
			} else {
				result.put(nums[i], 1);
			}
		}
		for (int key : result.keySet()) {
			if (result.get(key) > nums.length / 2)
				return key;
		}
		return 0;
	}
}
