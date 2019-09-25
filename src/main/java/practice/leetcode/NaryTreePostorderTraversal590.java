package practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal590 {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            if (root.children != null) {
                for (Node node : root.children) {
                    result.addAll(postorder(node));
                }
            }
            result.add(root.val);
        }
        return result;
    }
}
