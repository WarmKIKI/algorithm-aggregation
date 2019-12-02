package leetcode.tree;

public class BinaryTreeIsSame {
    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node3 = new TreeNode(3, node5, node6);
        TreeNode node4 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1, node3, node4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node = new TreeNode(0, node1, node2);
        TreeNode other1 = new TreeNode(4);
        TreeNode other2 = new TreeNode(5);
        TreeNode other = new TreeNode(3,other1, other2);
        System.out.println(binaryTreeIsSame(node, other));
    }

    public static boolean binaryTreeIsSame(TreeNode node1, TreeNode node2) {
        if(node1 != null && node2 != null) {
           if(node1 == node2) {
               return true;
           } else {
               return false;
           }
        }
        return binaryTreeIsSame(node1.left, node2.left) && binaryTreeIsSame(node1.right, node2.right);
    }
}
