package com.leetcode.graph;

public class DisjointSetUnion {

    private final int N;
    private final int[] parent;
    private final int[] size;

    public DisjointSetUnion(int n) {
        N = n;
        this.parent = new int[N];
        this.size = new int[N];
    }

    // Tạo tập hợp mới chỉ chứa phần tử v
    public void makeSet(int v) {
        parent[v] = v;
        size[v]++;
    }

    // Gộp 2 tập hợp chứa phần tử u và v làm 1
    public void unionSet(int u, int v) {
        int x = findRootSet(u);
        int y = findRootSet(v);

        if(x != y) {
            if(size[x] < size[y]) {
                int temp = x;
                x = y;
                y = temp;
            }
            parent[y] = x;
            size[x] += size[y];
        }
    }


    // Tìm phần tử root, đại diện cho tập hợp chứa u
    public int findRootSet(int u) {
        if(parent[u] == u) {
            return u;
        }
        return findRootSet(parent[u]);
    }

    public boolean areConnected(int u, int v) {
        return findRootSet(u) == findRootSet(v);
    }


}
