package leetcode.top100;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderII {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        helper(root, 0, result);
        return result;
    }

    private void helper(TreeNode node, int i, List<List<Integer>> result) {
         if(result.size() == i) result.add(new ArrayList<>());

         result.get(i).add(node.val);

         if(node.left != null) helper(node.left, i+1, result);
         if(node.right != null) helper(node.right, i+1, result);

    }
}
