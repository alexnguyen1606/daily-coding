package com.leetcode.graph;

public class MaximalNetworkRank_1615 {

    public int maximalNetworkRank(int n, int[][] roads) {
        int[] connected = new int[n];
        if (roads.length == 0) {
            return 0;
        }
        for (int i = 0; i < roads.length; i++) {
            int u = roads[i][0];
            int v = roads[i][1];
            connected[u]++;
            connected[v]++;
        }
        int max = 0;
        for (int i = 0; i < roads.length; i++) {
            int u = roads[i][0];
            int v = roads[i][1];
            int sum = connected[u] + connected[v] -1;
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    static class DisjointSetUnion {
        private final int N;
        private final int[] rank;
        private final int[] parent;

        public DisjointSetUnion(int n) {
            N = n;
            this.parent = new int[N];
            this.rank = new int[N];
            this.init();
        }

        private void init() {
            for (int i = 0; i < N; i++) {
                parent[i] = i;
            }
        }

        public int findRoot(int u) {
            if (u == parent[u]) {
                return u;
            }
            return findRoot(parent[u]);
        }

        public void join(int u, int v) {
            int rootU = findRoot(u);
            int rootV = findRoot(v);
            if (rootV != rootU) {
                parent[rootV] = rootU;
                rank[rootU]++;
            }
        }

        public int maxRank() {
            int max = 0;
            for (int i = 0; i < N; i++) {
                if (rank[i] >= max)
                    max = rank[i];
            }
            return max;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] graph = {
                {0, 1}, {0, 3}, {1, 2}, {1, 3}, {2, 3}, {2,4}
        };
        MaximalNetworkRank_1615 cal = new MaximalNetworkRank_1615();
        int max = cal.maximalNetworkRank(n, graph);
        System.out.println(max);
    }

}
