package practice.leetcode;

public class MaxConsecutiveOnes485 {
	public int findMaxConsecutiveOnes(int[] nums) {
		int result = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
				if (count > result) {
					result = count;
				}
			} else {
				if (nums.length - i < result)
					return result;
				count = 0;
			}
		}
		return result;
	}
}
