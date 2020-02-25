package leetcode.top100;

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return judge(root, root);
    }

    private boolean judge(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && judge(t1.left, t2.right)
                && judge(t1.right, t2.left);
    }
}
