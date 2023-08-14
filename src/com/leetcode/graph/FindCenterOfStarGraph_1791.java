package com.leetcode.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindCenterOfStarGraph_1791 {

    public int findCenter(int[][] edges) {
        Map<Integer, Integer> travelled = this.travel(edges);
        int totalNode = getTotalNode(edges);
        return nodeCenter(travelled, totalNode - 1);
    }

    private int nodeCenter(Map<Integer, Integer> map, int i) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == i) {
                return entry.getKey();
            }
        }
        return -1;
    }


    private Map<Integer, Integer> travel(int[][] edges) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int[] edge : edges) {
            result.put(edge[0], result.getOrDefault(edge[0], 0) + 1);
            result.put(edge[1], result.getOrDefault(edge[1], 0) + 1);
        }
        return result;

    }

    private Integer getTotalNode(int[][] edges) {
        Set<Integer> result = new HashSet();
        for (int[] edge : edges) {
            result.add(edge[0]);
            result.add(edge[1]);
        }
        return result.size();

    }


}
