package com.mydsa.unionfind;

public class MyDisjointSet {

    private int[] parent;
    private int[] rank;
    private int size;

    public MyDisjointSet(int n) {
        this.size = n;
        parent = new int[n];
        rank = new int[n];

        // Initially, each node is its own parent
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    // Find with path compression
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // path compression
        }
        return parent[x];
    }

    // Union by rank
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY) return;

        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }

    // Check if two elements are connected
    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }
}