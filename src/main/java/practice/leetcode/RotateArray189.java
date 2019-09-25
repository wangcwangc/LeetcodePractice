package practice.leetcode;

public class RotateArray189 {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        for (int i = 0; i < k; i++) {
            for (int j = length - 1; j > 0; j--) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        RotateArray189 rotateArray189 = new RotateArray189();
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateArray189.rotate(a, 3);
        System.out.println(a);
    }
}
