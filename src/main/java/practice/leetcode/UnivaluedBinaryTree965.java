package practice.leetcode;

public class UnivaluedBinaryTree965 {
    public boolean isUnivalTree(TreeNode root) {
        if (root != null) {
            return preIterator(root, root.val);
        }
        return true;
    }

    public boolean preIterator(TreeNode root, int K) {
        if (root != null) {
            if (K != root.val) return false;
            else {
                boolean result = true;
                if (root.left != null) result = preIterator(root.left, K);
                if (result) {
                    if (root.right != null) result = preIterator(root.right, K);
                }
                return result;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(6);
        TreeNode leftleft = new TreeNode(9);
        TreeNode leftright = new TreeNode(9);
        root.left = left;
        root.right = right;
        root.left.left = leftleft;
        root.left.right = leftright;
        UnivaluedBinaryTree965 univaluedBinaryTree965 = new UnivaluedBinaryTree965();
        System.out.println(univaluedBinaryTree965.isUnivalTree(root));
    }
}
