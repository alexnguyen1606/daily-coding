package com.leetcode.graph;

import java.util.*;

public class FindIfPathExistsInGraph_1971 {

    // edges là danh sách cạnh
    // bigO = n x n
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int[][] matrix = this.constructGraphMatrix(n, edges);
        return this.isHasPathSourceToDesUsingBPSByQueue(matrix, source, destination);

    }

    private boolean isHasPathSourceToDesUsingBPSByQueue(int[][] matrix, int source, int destination) {
        Set<Integer> travel = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        travel.add(source);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v = 0; v < matrix.length; v++) {
                if (matrix[u][v] == 1 && !travel.contains(v)) {
                    if (v == destination) {
                        return true;
                    }
                    queue.add(v);
                    travel.add(v);
                }
            }
        }
        return false;
    }


    private int[][] constructGraphMatrix(int n, int[][] edges) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            matrix[x][y] = 1;
            matrix[y][x] = 1;
        }
        return matrix;
    }


}
