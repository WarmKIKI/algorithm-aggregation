package leetcode.dynamic_drogramming;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

public class GenerateTrees {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(!list.isEmpty()) {

            }
            TreeNode node = new TreeNode(i);
            list.add(node);
        }
        return null;
    }
}
