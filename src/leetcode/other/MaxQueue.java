package leetcode.other;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class MaxQueue {
    Queue<Integer> queue;
    Queue<Integer> another;
    int max;
    public MaxQueue() {
        queue = new LinkedBlockingQueue();
        another = new LinkedBlockingQueue<>();
        max = Integer.MIN_VALUE;
    }

    public int max_value() {
        if(max == Integer.MIN_VALUE) return -1;
        else return max;
    }

    public void push_back(int value) {
        if(queue.isEmpty() &&  !another.isEmpty()) {
            queue.add(another.poll());
        }
        if(max < value) max = value;
        queue.add(value);
    }

    public int pop_front() {
        if(!queue.isEmpty()) {
            int tmp = queue.poll();
            if(tmp == max) {
                max = Integer.MIN_VALUE;
                while (!queue.isEmpty()){
                    int value = another.poll();
                    if(value > max) {
                        max = value;
                    }
                    another.add(value);
                }
            }
            return tmp;
        }
        return -1;
    }

    public static void main(String[] args) {
        MaxQueue maxQueue = new MaxQueue();
        maxQueue.push_back(1);
        maxQueue.push_back(2);
        System.out.println(maxQueue.max_value());
        maxQueue.pop_front();
        System.out.println(maxQueue.max_value());
    }
}
