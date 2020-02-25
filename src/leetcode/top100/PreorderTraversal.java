package leetcode.top100;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        helper(root, list);
        return list;
    }

    public void helper(TreeNode root, List<Integer> list) {
        if(root != null) list.add(root.val);
        if(root.left != null) helper(root.left, list);
        if(root.right != null) helper(root.right, list);
    }
}
