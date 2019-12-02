package leetcode.tree;

public class GetHigh {
    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node3 = new TreeNode(3, node5, node6);
        TreeNode node4 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1, node3, node4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node = new TreeNode(0, node1, node2);
        System.out.println(gethigh(node));
    }
    public static int gethigh(TreeNode node) {
        if (node != null) {
            return gethigh(node.left) > gethigh(node.right) ? gethigh(node.left) + 1: gethigh(node.right) + 1;
        } else {
            return 0;
        }
    }
}
