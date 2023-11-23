package com.leetcode.graph;

public class FindIfPathExistsInGraphUsingDSU_1971 {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        DisjointSetUnion dsu = new DisjointSetUnion(n);
        for (int i = 0; i < n; i++) {
            dsu.makeSet(i);
        }
        for (int i = 0; i < edges.length; i++) {
            dsu.unionSet(edges[i][0], edges[i][1]);
        }
        return dsu.findRootSet(source) == dsu.findRootSet(destination);
    }

    class DisjointSetUnion {

        private final int N;
        private final int[] parent;

        public DisjointSetUnion(int n) {
            N = n;
            this.parent = new int[N];
        }

        // Tạo tập hợp mới chỉ chứa phần tử v
        public void makeSet(int v) {
            parent[v] = v;
        }

        // Gộp 2 tập hợp chứa phần tử u và v làm 1
        public void unionSet(int u, int v) {
            int x = findRootSet(u);
            int y = findRootSet(v);

            if(x != y) {
                parent[x] = y;
            }
        }

        // Tìm phần tử root, đại diện cho tập hợp chứa u
        public int findRootSet(int u) {
            if(parent[u] == u) {
                return u;
            }
            return findRootSet(parent[u]);
        }


    }


}
