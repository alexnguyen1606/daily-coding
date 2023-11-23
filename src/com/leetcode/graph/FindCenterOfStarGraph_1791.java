package com.leetcode.graph;

public class FindCenterOfStarGraph_1791 {

    public int findCenter(int[][] edges) {
        int totalNode = edges.length + 1;
        return nodeCenter(edges, totalNode);
    }

    private int nodeCenter(int[][] edges, int totalNode) {
        int[] travelled = new int[totalNode + 1];
        for (int[] edge : edges) {
            travelled[edge[0]]++;
            travelled[edge[1]]++;
        }

        for (int i = 1; i < travelled.length; i++) {
            if (travelled[i] == totalNode - 1) {
                return i;
            }
        }
        return -1;
    }


}
