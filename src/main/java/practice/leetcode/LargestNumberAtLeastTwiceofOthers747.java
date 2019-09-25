package practice.leetcode;

public class LargestNumberAtLeastTwiceofOthers747 {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int minMax = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                minMax = max * 2;
                max = nums[i];
                index = i;
            }
            if (nums[i] * 2 > minMax && nums[i] != max) {
                minMax = nums[i] * 2;
            }
        }
        return max >= minMax ? index : -1;
    }
}
