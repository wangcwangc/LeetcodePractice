package practice.leetcode;

public class MaximumBinaryTree654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode treeNode = new TreeNode(max);
        treeNode.left = constructMaximumBinaryTreeSubArray(nums, 0, index);
        treeNode.right = constructMaximumBinaryTreeSubArray(nums, index + 1, nums.length);
        return treeNode;
    }

    private TreeNode constructMaximumBinaryTreeSubArray(int[] nums, int start, int end) {
        if (start == end) return null;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = start; i < end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode treeNode = new TreeNode(max);
        treeNode.left = constructMaximumBinaryTreeSubArray(nums, start, index);
        treeNode.right = constructMaximumBinaryTreeSubArray(nums, index + 1, end);
        return treeNode;
    }
}
