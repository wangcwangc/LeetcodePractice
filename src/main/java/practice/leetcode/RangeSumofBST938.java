package practice.leetcode;

public class RangeSumofBST938 {
    boolean flag = false;

    public int rangeSumBST(TreeNode root, int L, int R) {
        int result = 0;
        if (root.left != null) result = result + rangeSumBST(root.left, L, R);
        if (root.val == L) {
            flag = true;
        }
        if (root.val == R) {
            flag = false;
            result = result + root.val;
        }
        if (flag) {
            result = result + root.val;
        }
        if (root.right != null) result = result + rangeSumBST(root.right, L, R);
        return result;
    }
}
