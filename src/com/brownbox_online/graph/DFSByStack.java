package com.brownbox_online.graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 * <p>9:54 PM ,August 24,2021
 */
public class DFSByStack {

    public static void dfsByStack(int[][] graph) {

        Stack<Integer> stack = new Stack<>();
        Set<Integer> traveled = new HashSet<>();
        // Gán đỉnh đầu vào stack
        stack.push(0);
        // đánh dấu đỉnh đầu đã được duyệt
        traveled.add(0);

        Integer u = null;
        while (!stack.isEmpty()) {
            u = stack.pop();
            // xử lý u
            System.out.print(u + " ");
            // add tất cả các đỉnh v (chưa được duyệt) kề với u
            // Đánh dấu các đỉnh v là đã được duyệt
            for (int v = 0; v < graph.length; v++) {
                // kiểm tra kề và chưa duyệt
                if (graph[u][v] == 1 && !traveled.contains(v)) {

                    // Đánh dấu đỉnh v
                    traveled.add(v);
                    stack.push(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + j) % 2 != 0) graph[i][j] = 1;
            }
        }
        print(graph);
        dfsByStack(graph);
        Set<Integer> sets = new HashSet<>();
        System.out.println();
        sets.add(0);
        DFSByRecursion.dfsByRecursion(0, graph, sets);
        System.out.println();
        BFSByQueue.bfsByQueue(graph);
    }

    public static void print(int[][] graph) {
        int n = graph.length;
        int m = graph[n - 1].length;
        System.out.print("  ");
        for (int i = 0; i < m; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + i);
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + graph[i][j]);
            }
            System.out.println();
        }
    }
}
