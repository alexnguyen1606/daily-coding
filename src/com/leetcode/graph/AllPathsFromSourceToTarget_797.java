package com.leetcode.graph;

import java.util.List;

public class AllPathsFromSourceToTarget_797 {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        return allPathsSourceTarget(graph, 0, graph.length - 1);
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph, int source, int target) {
        int n = graph.length;
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; i < graph[i].length; j++) {
                matrix[i][j] = 1;
            }
        }
        int[] rows = matrix[source];

        return null;
    }

    public List<List<Integer>> pathsSourceTarget(int[][] graph, int source, int target, List<Integer> path) {
        int[] sourcePath = graph[source];

        return null;
    }

}
