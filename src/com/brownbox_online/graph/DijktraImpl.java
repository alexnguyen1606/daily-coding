package com.brownbox_online.graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 2:54 PM ,August 25,2021
 */
public class DijktraImpl {

    public static void main(String[] args) {
        int n = 5;
        int[][] grid = {
                {0, 6, 0, 1, 0},
                {6, 0, 5, 2, 2},
                {0, 5, 0, 0, 5},
                {1, 2, 0, 0, 1},
                {0, 2, 5, 1, 0}
        };
        Set<Integer> visited = new HashSet<>();
        int[] previous = new int[5];//previous[i] là đỉnh phái trước i
        int[] distances = new int[5];//distances[i] là khoảng cách đến i
        int start = 0;
        int finish = 4;
        //B1 Init khoảng cách
        for (int i = 0; i < n; i++) {
            distances[i] = Integer.MAX_VALUE;
        }
        distances[start] = 0;
        while (visited.size() < n) {
            //B2
            // Chọn đỉnh chưa duyệt có khoảng cách nhỏ nhất
            int currentNode = start;
            int minDistance = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (!visited.contains(i) && distances[i] < minDistance) {
                    currentNode = i;
                    minDistance = distances[i];
                }
            }
            //B3
            // Duyệt các đỉnh kề chưa duyệt
            // Update khoảng cách và previous
            for (int i = 0; i < n; i++) {
                if (!visited.contains(i) && grid[currentNode][i] != 0) {
                    int newDistance = grid[currentNode][i] + distances[currentNode];
                    if (distances[i] > newDistance) {
                        distances[i] = distances[currentNode] + grid[currentNode][i];
                        previous[i] = currentNode;
                    }
                }

            }
            //B4
            //Đánh dấu đã duyệt
            visited.add(currentNode);
        }
        System.out.println("Khoảng cách:" + distances[finish]);
        Stack<Integer> stack = new Stack<>();
        int run = finish;
        while (run != start) {
            stack.push(run);
            run = previous[run];
        }
        stack.push(run);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ->");
        }

    }
}
