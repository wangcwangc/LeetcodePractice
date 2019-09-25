package practice.leetcode;

public class InvertBinaryTree226 {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            if (root.left != null && root.right != null) {
                TreeNode temp = root.left;
                root.left = root.right;
                root.right = temp;
                invertTree(root.left);
                invertTree(root.right);
            } else if (root.left != null) {
                root.right = root.left;
                root.left = null;
                invertTree(root.right);
            } else if (root.right != null) {
                root.left = root.right;
                root.right = null;
                invertTree(root.left);
            }
        }
        return root;
    }
}
