package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class CreateTree {
    public static void main(String[] args) {
        TreeNode node = createTree(new int[]{1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1});
        layerTraversal(node);
    }

    public static TreeNode createTree(int[] aim) {
        TreeNode node = new TreeNode(aim[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        for (int i = 1; i < aim.length-1; i++) {
            if(!queue.isEmpty()) {
                TreeNode temp = queue.poll();
                TreeNode left = new TreeNode(aim[i]);
                TreeNode right = new TreeNode(aim[++i]);
                temp.left = left;
                temp.right = right;
                queue.add(left);
                queue.add(right);
            }
        }
        return node;
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
