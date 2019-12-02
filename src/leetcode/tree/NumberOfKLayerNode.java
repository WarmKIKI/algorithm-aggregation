package leetcode.tree;

public class NumberOfKLayerNode {
    public static int numberOfKLayerNode(TreeNode node, int k) {
        if(node == null || k < 0) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        int left = numberOfKLayerNode(node.left, k-1);
        int right = numberOfKLayerNode(node.right, k-1);
        return left + right;
    }
}
