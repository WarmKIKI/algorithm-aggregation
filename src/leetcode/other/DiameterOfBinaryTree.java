package leetcode.other;

public class DiameterOfBinaryTree {
    int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return 0;
        helper(root);
        return max - 1;
    }

    private int helper(TreeNode root) {
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        if(left + right + 1 > max) max = left + right + 1;
        return left > right ? left + 1 : right + 1;
    }
}
