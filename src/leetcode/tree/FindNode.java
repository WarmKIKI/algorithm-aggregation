package leetcode.tree;

public class FindNode {
    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node3 = new TreeNode(3, node5, node6);
        TreeNode node4 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1, node3, node4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node = new TreeNode(0, node1, node2);
        TreeNode temp = findNode(node, 4);
        System.out.println(temp.val);
    }


    public static TreeNode findNode(TreeNode node, int aim) {
        TreeNode value = null;
        if(node != null) {
            if (node.val == aim) {
                value = node;
            } else {
                if(value == null) {
                    value = findNode(node.left, aim);
                }
                if(value == null) {  // 当找到4的时候 if 语句不成立了 就直接retrue
                    value = findNode(node.right, aim);
                }
            }
        }
        return value;
    }
}
