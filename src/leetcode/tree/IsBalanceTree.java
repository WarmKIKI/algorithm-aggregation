package leetcode.tree;

//  左右节点的高度不超过1
public class IsBalanceTree {
    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1,node2,node4);
        TreeNode root = new TreeNode(0, node1, null);

        IsBalanceTree isBalanceTree = new IsBalanceTree();
        Boolean bool = isBalanceTree.isBalanceTree(root);
        System.out.println(root.val);
        System.out.println(bool);
    }

    public int calculate(TreeNode root, int tap) {
        if(root == null) return 0;
        int left = calculate(root.left, tap);
        int right = calculate(root.right, tap);
        tap = left >= right ? left - right : right - left;
        root.val = tap;
        return left > right? left + 1 : right +1;
    }

    public boolean isBalanceTree(TreeNode node) {
        if(node == null) return true;
        isBalanceTree(node.left);
        isBalanceTree(node.right);
        calculate(node, 0);
       return node.val > 1 ? false : true;
    }
}
