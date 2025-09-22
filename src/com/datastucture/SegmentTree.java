package com.datastucture;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class SegmentTree {

    private int[] tree;
    private int[] input;

    SegmentTree(int[] input) {
        this.input = input;
        this.tree = new int[input.length * 4];
        build(1, 0, input.length - 1);
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7 };
        SegmentTree segmentTree = new SegmentTree(input);
        segmentTree.printTree();
//        new HashMap<>().put();
//        new Hashtable().get()
//        new ConcurrentHashMap<>().get()
    }

    public void build(int v, int left, int right) {
        if (left == right) {
            tree[v] = input[left];
            return;
        }
        int mid = (left + right) / 2;
        build(2 * v, left, mid);
        build(2 * v + 1, mid + 1, right);
        tree[v] = tree[2 * v] + tree[2 * v + 1];
    }

    public void update(int index, int val) {
        if (index < 0 || index >= input.length) {
            return;
        }
        this.input[index] = val;
        update(1, 0, input.length - 1, index, val);
    }

    // v vị trí trên tree
    // pos index update trên mảng dữ liệu gốc input
    // val giá trị thay đổi
    private void update(int v, int left, int right, int pos, int val) {
        if (left == right) {
            tree[v] = val;
            return;
        }
        int mid = (left + right) / 2;
        if (pos <= mid) {
            update(2 * v, left, mid, pos, val);
        } else {
            update(2 * v + 1, mid + 1, right, pos, val);
        }
        tree[v] = tree[2 * v] + tree[2 * v + 1];
    }

    public void updateIndexLowerThanBecome(int compare, int val) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] < compare) {
                update(i, val);
            }
        }
    }

    public int sum(int i, int j) {
        return query(1, 0, this.input.length - 1, i, j);
    }

    public int query(int v, int tLeft, int tRight, int left, int right) {
        if (tLeft > right || tRight < left) {
            return 0;
        }
        // [left, right] in [tLeft, tRight]
        if (left <= tLeft && tRight <= right) {
            return tree[v];
        }
        int mid = (tLeft + tRight) / 2;

        return query(2 * v, tLeft, mid, left, right) +
                query(2 * v + 1, mid + 1, tRight, left, right);
    }

    public void printTree() {
        System.out.println("--------------");
        int level = 0;
        int nodesInLevel = 1;
        int i = 1; // Start from 1 for segment tree (1-based index)
        int n = tree.length - 1;
        while (i <= n) {
            // Print leading spaces for pretty formatting
            for (int s = 0; s < (1 << (Math.max(0, (int) (Math.log(n + 1) / Math.log(2)) - level))); s++) {
                System.out.print(" ");
            }
            // Print all nodes at this level
            for (int j = 0; j < nodesInLevel && i <= n; j++, i++) {
                System.out.print(tree[i]);
                // Print space between nodes
                for (int s = 0; s < (1 << (Math.max(0, (int) (Math.log(n + 1) / Math.log(2)) - level + 1))); s++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            level++;
            nodesInLevel <<= 1;
        }
    }

}
