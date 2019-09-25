package practice.leetcode;

import java.util.Arrays;

public class MaximumProductofThreeNumbers628 {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int max1 = nums[0] * nums[1] * nums[nums.length - 1];
		int max2 = nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1];
		if (max1 > max2)
			return max1;
		else
			return max2;
	}
}
