package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImage {
    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node3 = new TreeNode(3, node5, node6);
        TreeNode node4 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1, node3, node4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node = new TreeNode(0, node1, node2);
        layerTraversal(node);
        binaryTreeImage(node);
        layerTraversal(node);
    }

    public static void binaryTreeImage(TreeNode node) {
        if(node != null) {
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            binaryTreeImage(node.left);
            binaryTreeImage(node.right);
        }
    }

    public static void layerTraversal(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (node != null) {
            queue.add(node);
            while(!queue.isEmpty()) {
                TreeNode temp = queue.poll();
                System.out.print(temp.val + " ");
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
        }
    }
}
