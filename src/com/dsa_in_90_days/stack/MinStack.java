package com.dsa_in_90_days.stack;

import java.util.Stack;

public class MinStack {

    private final Stack<Node> stack;
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.empty()) {
            stack.push(new Node(val, val));
            return;
        }
        Node peekValue = stack.peek();
        int min = Math.min(peekValue.min, val);
        Node node = new Node(val, min);
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().min;
    }

    private static class Node {
        private final Integer value;
        private final Integer min;

        private Node(Integer value, Integer min) {
            this.value = value;
            this.min = min;
        }
    }
}
