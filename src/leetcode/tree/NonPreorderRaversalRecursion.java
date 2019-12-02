package leetcode.tree;

import java.util.Stack;

public class NonPreorderRaversalRecursion {
    public void nonPreorderRaverersalRecursion(TreeNode node) {
        Stack<TreeNode> stack = new Stack();
        TreeNode T = node;
        while(T != null || !stack.empty()) {
            while (T != null) {
                System.out.println(T.val);
                stack.push(T);
                T = T.left;
            }
            if(!stack.empty()) {
                T = stack.pop();
                T = T.right;
            }
        }
    }

    public void nonInorderTraversalRecursion(TreeNode node) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode T = node;
        while(T != null || !stack.empty()) {
            while (T != null) {
                stack.push(T);
                T = T.left;
            }
            if(!stack.empty()) {
                T = stack.pop();
                System.out.println(T.val);
                T = T.right;
            }
        }
    }

    public void nonPostorderraversalRecursion(TreeNode node) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode T = node;
        while(T != null || !stack1.empty()) {
            while (T != null) {
                stack2.push(T);
                stack1.push(T);
                T = T.right;
            }
            if(!stack1.empty()) {
                T = stack1.pop();
                T = T.left;
            }
        }
        while (!stack1.empty()) {
            T = stack1.pop();
            System.out.println(T.val);
        }
    }

}
