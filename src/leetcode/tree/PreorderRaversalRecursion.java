package leetcode.tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class PreorderRaversalRecursion {
    public void PreorderRaversal(TreeNode node) {
        System.out.println(node.val);
        PreorderRaversal(node.left);
        PreorderRaversal(node.right);
    }
}
