package practice.leetcode;

public class MissingNumber268 {
	public int missingNumber(int[] nums) {
		int length = nums.length;
		double num = (length + 1) / 2.0 * length;
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		return (int) (num - sum);
	}
}
