package practice.leetcode;

import java.util.Stack;

public class ImplementQueueusingStacks232 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.peek();
        myQueue.pop();
        myQueue.empty();
    }
}

class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    Stack<Integer> cache;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        cache = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack2 = new Stack<>();
        stack1.push(x);
        int size = stack1.size();
        for (int i = 0; i < size; i++) {
            int pop = stack1.pop();
            stack2.push(pop);
            cache.push(pop);
        }
        int cacheSize = cache.size();
        for (int i = 0; i < cacheSize; i++) {
            stack1.push(cache.pop());
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        int result = stack2.pop();
        stack1 = new Stack<>();
        int size = stack2.size();
        for (int i = 0; i < size; i++) {
            int pop = stack2.pop();
            stack1.push(pop);
            cache.push(pop);
        }
        int cacheSize = cache.size();
        for (int i = 0; i < cacheSize; i++) {
            stack2.push(cache.pop());
        }
        return result;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return stack2.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack2.empty();
    }
}