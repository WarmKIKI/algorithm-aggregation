package leetcode.other;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

// 1 2 3 4 5
public class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int top;
    public MyStack() {
        q1 = new ConcurrentLinkedQueue();
        q2 = new ConcurrentLinkedQueue();
        top = 0;
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(!q1.isEmpty()) {
            top = q1.poll();
            if(q1.isEmpty()) break;
            q2.add(top);
        }
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
        return top;
    }

    /** Get the top element. */
    public int top() {
        while(!q1.isEmpty()) {
            top = q1.poll();
            q2.add(top);
        }
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(q1.isEmpty()) return true;
        else return false;
    }
}
