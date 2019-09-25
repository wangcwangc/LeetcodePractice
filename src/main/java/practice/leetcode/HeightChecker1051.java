package practice.leetcode;

import java.util.Arrays;

public class HeightChecker1051 {
    public int heightChecker(int[] heights) {
        int[] sort = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sort);
        int nums = 0;
        for (int i = 0; i < heights.length; i++) {
            if (sort[i] != heights[i]) {
                nums++;
            }
        }
        return nums;
    }
}
