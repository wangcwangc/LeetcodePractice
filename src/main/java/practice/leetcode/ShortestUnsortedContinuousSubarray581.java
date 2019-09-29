package practice.leetcode;

public class ShortestUnsortedContinuousSubarray581 {
    public int findUnsortedSubarray(int[] nums) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                start = i;
                break;
            }
        }
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] > nums[i]) {
                end = i;
                break;
            }
        }
        if (start == 0 && end == 0) return 0;
        return end - start + 1;
    }

    public static void main(String[] args) {
        ShortestUnsortedContinuousSubarray581 shortestUnsortedContinuousSubarray581 = new ShortestUnsortedContinuousSubarray581();
        System.out.println(shortestUnsortedContinuousSubarray581.findUnsortedSubarray(new int[]{1,2,3,4}));
    }
}
