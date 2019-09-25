package practice.leetcode;

import java.util.HashSet;
import java.util.Set;

public class SetMismatch645 {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int length = nums.length;
        int sum = length * (length + 1) / 2;
        int[] result = new int[2];
        for (int i = 0; i < length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                sum = sum - nums[i];
            } else {
                result[0] = nums[i];
            }
        }
        result[1] = sum;
        return result;
    }
}
