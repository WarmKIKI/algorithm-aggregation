package leetcode.top100;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    List<String> list;
    public MinStack() {
        stack = new Stack<>();
        list = new ArrayList<>();
    }

    public void push(int x) {
        stack.push(x);
        if(list.isEmpty()) list.add(String.valueOf(x));
        else {
            boolean flag = false;
            int length = list.size();
            for (int i = 0; i < length; i++) {
                String elem = list.get(i);
                if (x > Integer.valueOf(elem)) {
                    list.add(list.indexOf(elem), String.valueOf(x));
                    flag = true;
                    break;
                }
            }
            if(flag == false) list.add(String.valueOf(x));
        }
    }

    public void pop() {
        int tmp = stack.pop();
        list.remove(String.valueOf(tmp));
    }

    public int top() {
        return  stack.peek();
    }

    public int getMin() {
        return Integer.valueOf(list.get(list.size()-1));
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2147483648);
        obj.push(2);
        obj.push(-2);
        obj.push(7);
        obj.push(-4);
        obj.push(2147483647);
        int top = obj.top();
        System.out.println(top);
        int min = obj.getMin();
        System.out.println(min);
        obj.pop();
        int minTwo = obj.getMin();
        System.out.println(minTwo);
    }

   /* public void push(int x) {
        stack.push(x);
        if(list.isEmpty()) list.add(x);
        for (Integer elem : list) {
            if(x > elem) list.add(list.indexOf(elem)-1, x);
            else list.add(x);
        }
    }*/
}
