package leetcode.tree;

public class JudgeNode {
    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node3 = new TreeNode(3, node5, node6);
        TreeNode node4 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1, node3, node4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node = new TreeNode(0, node1, node2);
        System.out.println(judgeNode(node, node5));
    }

    // 判断一个节点是否在一棵二叉树中
    public static boolean judgeNode(TreeNode node, TreeNode temp) {
        if(node == null || temp == null) return false;
        if(node == temp) return true;
        return judgeNode(node.left, temp) || judgeNode(node.right, temp);
    }
}
