package practice.leetcode;

public class NondecreasingArray665 {
    public boolean checkPossibility(int[] nums) {
        if (nums.length < 3) {
            return true;
        }
        boolean change = false;
        if (nums[1] < nums[0]) {
            nums[0] = nums[1];
            change = true;
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (change) {
                    return false;
                } else {
                    if (nums[i] < nums[i - 2]) {
                        nums[i] = nums[i - 1];
                    } else {
                        nums[i - 1] = nums[i - 2];
                    }
                    change = true;
                }
            }
        }
        return true;
    }
}
