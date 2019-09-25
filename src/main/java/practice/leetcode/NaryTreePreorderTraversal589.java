package practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal589 {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            result.add(root.val);
            if (root.children != null) {
                for (Node node : root.children) {
                    result.addAll(preorder(node));
                }
            }
        }
        return result;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};