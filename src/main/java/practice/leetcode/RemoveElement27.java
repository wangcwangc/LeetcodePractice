package practice.leetcode;

public class RemoveElement27 {
	public int removeElement(int[] nums, int val) {
		int result = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == val && nums[j] != val) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					break;
				}
			}
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == val)
				result++;
			else
				break;
		}
		return nums.length - result;
	}
}
