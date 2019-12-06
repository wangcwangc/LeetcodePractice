package practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> tempList = new ArrayList<>();
            for (int j = 0; j < result.size(); j++) {
                ArrayList<Integer> temp = new ArrayList<>(result.get(j));
                temp.add(nums[i]);
                tempList.add(temp);
            }
            result.addAll(tempList);
        }
        return result;
    }
}
