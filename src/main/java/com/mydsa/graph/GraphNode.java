package com.mydsa.graph;

public class GraphNode {
    public String label;
    public GraphNode[] neighbors;
    public int neighborCount;

    private static final int MAX_NEIGHBORS = 20; // Arbitrary limit for simplicity

    public GraphNode(String label) {
        this.label = label;
        this.neighbors = new GraphNode[MAX_NEIGHBORS];
        this.neighborCount = 0;
    }

    public void addNeighbor(GraphNode node) {
        if (!hasNeighbor(node) && neighborCount < MAX_NEIGHBORS) {
            neighbors[neighborCount++] = node;
        }
    }

    public void removeNeighbor(GraphNode node) {
        for (int i = 0; i < neighborCount; i++) {
            if (neighbors[i] == node) {
                for (int j = i; j < neighborCount - 1; j++) {
                    neighbors[j] = neighbors[j + 1];
                }
                neighbors[--neighborCount] = null;
                break;
            }
        }
    }

    public boolean hasNeighbor(GraphNode node) {
        for (int i = 0; i < neighborCount; i++) {
            if (neighbors[i] == node) {
                return true;
            }
        }
        return false;
    }
}