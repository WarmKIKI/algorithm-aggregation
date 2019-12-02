package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LayerTraversal {
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1, node3, node4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node = new TreeNode(0, node1, node2);
        layerTraversal(node);
    }

    public static void layerTraversal(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (node != null) {
            queue.add(node);
            while(!queue.isEmpty()) {
                TreeNode temp = queue.poll();
                System.out.println(temp.val);
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
        }
    }
}
