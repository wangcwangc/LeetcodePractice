package practice.leetcode;

import java.util.HashSet;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> notDuplicate = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            notDuplicate.add(nums[i]);
        }
        if (notDuplicate.size() != nums.length) {
            return true;
        }
        return false;
    }
}
