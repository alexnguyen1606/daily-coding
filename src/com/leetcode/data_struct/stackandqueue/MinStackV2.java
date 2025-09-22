package com.leetcode.data_struct.stackandqueue;

import java.util.LinkedList;
import java.util.Stack;

public class MinStackV2 {

    private final Stack<Node> stacks;

    public MinStackV2() {
        stacks = new Stack<>();
    }

    public void push(int val) {
        Node node = new Node(val);
        if (stacks.empty()) {
            node.min = node.value;
            stacks.push(node);
            return;
        }
        node.min = Math.min(stacks.peek().min, node.value);
        stacks.push(node);
    }

    public void pop() {
        stacks.pop();
    }

    public int top() {
        if (stacks.empty()) {
            return -1;
        }
        return stacks.peek().value;
    }

    public int getMin() {
        if (stacks.empty()) {
            return -1;
        }
        return stacks.peek().min;
    }

    public static class Node {
        private Integer value;
        private Integer min;

        Node(Integer value) {
            this.value = value;
        }
    }


}
