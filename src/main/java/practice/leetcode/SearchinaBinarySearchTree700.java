package practice.leetcode;

public class SearchinaBinarySearchTree700 {
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null)
			return root;
		if (root.val == val)
			return root;
		else {
			TreeNode right = searchBST(root.right, val);
			if (right == null)
				return searchBST(root.left, val);
			else
				return right;
		}
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
