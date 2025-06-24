package com.mydsa.graph;

public class MyGraph {

    private GraphNode[] vertices;
    private int vertexCount;
    private static final int MAX_VERTICES = 100;

    public MyGraph() {
        vertices = new GraphNode[MAX_VERTICES];
        vertexCount = 0;
    }

    public void addVertex(String label) {
        if (getVertex(label) != null || vertexCount >= MAX_VERTICES) return;
        vertices[vertexCount++] = new GraphNode(label);
    }

    public void removeVertex(String label) {
        GraphNode toRemove = getVertex(label);
        if (toRemove == null) return;

        // Remove from vertices list
        int index = getVertexIndex(label);
        for (int i = index; i < vertexCount - 1; i++) {
            vertices[i] = vertices[i + 1];
        }
        vertices[--vertexCount] = null;

        // Remove from other node's neighbors
        for (int i = 0; i < vertexCount; i++) {
            vertices[i].removeNeighbor(toRemove);
        }
    }

    public void addEdge(String fromLabel, String toLabel) {
        GraphNode from = getVertex(fromLabel);
        GraphNode to = getVertex(toLabel);
        if (from != null && to != null) {
            from.addNeighbor(to); // Directed edge
        }
    }

    public void removeEdge(String fromLabel, String toLabel) {
        GraphNode from = getVertex(fromLabel);
        GraphNode to = getVertex(toLabel);
        if (from != null && to != null) {
            from.removeNeighbor(to);
        }
    }

    public boolean hasEdge(String fromLabel, String toLabel) {
        GraphNode from = getVertex(fromLabel);
        GraphNode to = getVertex(toLabel);
        return from != null && to != null && from.hasNeighbor(to);
    }

    public void printGraph() {
        for (int i = 0; i < vertexCount; i++) {
            System.out.print(vertices[i].label + " -> ");
            for (int j = 0; j < vertices[i].neighborCount; j++) {
                System.out.print(vertices[i].neighbors[j].label + " ");
            }
            System.out.println();
        }
    }

    private GraphNode getVertex(String label) {
        for (int i = 0; i < vertexCount; i++) {
            if (vertices[i].label.equals(label)) {
                return vertices[i];
            }
        }
        return null;
    }

    private int getVertexIndex(String label) {
        for (int i = 0; i < vertexCount; i++) {
            if (vertices[i].label.equals(label)) {
                return i;
            }
        }
        return -1;
    }

    // ✅ DFS traversal (recursive)
    public void dfs(String startLabel) {
        boolean[] visited = new boolean[MAX_VERTICES];
        GraphNode start = getVertex(startLabel);
        if (start != null) {
            System.out.print("DFS from " + startLabel + ": ");
            dfsHelper(start, visited);
            System.out.println();
        }
    }

    private void dfsHelper(GraphNode node, boolean[] visited) {
        int index = getVertexIndex(node.label);
        if (visited[index]) return;

        visited[index] = true;
        System.out.print(node.label + " ");

        for (int i = 0; i < node.neighborCount; i++) {
            dfsHelper(node.neighbors[i], visited);
        }
    }

    // ✅ BFS traversal (queue-based)
    public void bfs(String startLabel) {
        boolean[] visited = new boolean[MAX_VERTICES];
        GraphNode[] queue = new GraphNode[MAX_VERTICES];
        int front = 0, rear = 0;

        GraphNode start = getVertex(startLabel);
        if (start == null) return;

        int startIndex = getVertexIndex(startLabel);
        visited[startIndex] = true;
        queue[rear++] = start;

        System.out.print("BFS from " + startLabel + ": ");

        while (front < rear) {
            GraphNode current = queue[front++];
            System.out.print(current.label + " ");

            for (int i = 0; i < current.neighborCount; i++) {
                GraphNode neighbor = current.neighbors[i];
                int neighborIndex = getVertexIndex(neighbor.label);
                if (!visited[neighborIndex]) {
                    visited[neighborIndex] = true;
                    queue[rear++] = neighbor;
                }
            }
        }

        System.out.println();
    }
}