package leetcode.tree;

public class NumberOfLeafNodes {
    public static void main(String[] args) {
        TreeNode node8 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6, node7, node8);
        TreeNode node3 = new TreeNode(3, node5, node6);
        TreeNode node4 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1, node3, node4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node = new TreeNode(0, node1, node2);
        int number = getNumberOfLeafNodes(node);
        System.out.println(number);
    }
    private static int flag = 0;
    public static int getNumberOfLeafNodes(TreeNode node) {
        if(node != null) {
            if(node.left == null && node.right == null)  flag++;
            getNumberOfLeafNodes(node.left);
            getNumberOfLeafNodes(node.right);
        }
        return flag;
    }
}
