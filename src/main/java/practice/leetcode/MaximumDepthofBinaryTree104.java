package practice.leetcode;

public class MaximumDepthofBinaryTree104 {
    public int maxDepth(TreeNode root) {
        if (root != null) {
            int depth = 1;
            int leftDepth = 0;
            int rightDepth = 0;
            if (root.left != null) leftDepth = maxDepth(root.left);
            if (root.right != null) rightDepth = maxDepth(root.right);
            if (leftDepth > rightDepth) depth = depth + leftDepth;
            else depth = depth + rightDepth;
            return depth;
        } else return 0;
    }
}
