package practice.leetcode;

public class MaximumDepthofNaryTree559 {
    public int maxDepth(Node root) {
        int depth = 0;
        if (root != null) {
            depth = 1;
            if (root.children != null) {
                int tempDepth = 0;
                for (Node childrenNode : root.children) {
                    int childrenDepth = maxDepth(childrenNode);
                    if (childrenDepth > tempDepth) tempDepth = childrenDepth;
                }
                depth = tempDepth + 1;
            }
        }
        return depth;
    }
}
