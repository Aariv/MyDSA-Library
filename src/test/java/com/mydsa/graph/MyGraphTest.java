package com.mydsa.graph;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyGraphTest {

    @Test
    public void testAddVertex() {
        MyGraph graph = new MyGraph();
        graph.addVertex("A");
        graph.addVertex("B");

        assertTrue(graph.hasEdge("A", "B") == false); // no edge yet
    }

    @Test
    public void testAddEdge() {
        MyGraph graph = new MyGraph();
        graph.addVertex("A");
        graph.addVertex("B");

        graph.addEdge("A", "B");
        assertTrue(graph.hasEdge("A", "B"));
        assertFalse(graph.hasEdge("B", "A")); // Directed
    }

    @Test
    public void testRemoveEdge() {
        MyGraph graph = new MyGraph();
        graph.addVertex("X");
        graph.addVertex("Y");

        graph.addEdge("X", "Y");
        assertTrue(graph.hasEdge("X", "Y"));

        graph.removeEdge("X", "Y");
        assertFalse(graph.hasEdge("X", "Y"));
    }

    @Test
    public void testRemoveVertex() {
        MyGraph graph = new MyGraph();
        graph.addVertex("M");
        graph.addVertex("N");
        graph.addVertex("O");

        graph.addEdge("M", "N");
        graph.addEdge("O", "N");

        graph.removeVertex("N");

        assertFalse(graph.hasEdge("M", "N"));
        assertFalse(graph.hasEdge("O", "N"));
    }

    @Test
    public void testAddDuplicateVertex() {
        MyGraph graph = new MyGraph();
        graph.addVertex("Z");
        graph.addVertex("Z"); // should be ignored

        graph.addVertex("Y");
        graph.addEdge("Z", "Y");

        assertTrue(graph.hasEdge("Z", "Y"));
    }

    @Test
    public void testAddEdgeToNonexistentVertex() {
        MyGraph graph = new MyGraph();
        graph.addVertex("A");
        graph.addEdge("A", "B"); // B doesn't exist

        assertFalse(graph.hasEdge("A", "B"));
    }

    @Test
    public void testGraphPrintOutput() {
        MyGraph graph = new MyGraph();
        graph.addVertex("1");
        graph.addVertex("2");
        graph.addVertex("3");

        graph.addEdge("1", "2");
        graph.addEdge("1", "3");

        graph.printGraph(); // Visually inspect in console
    }
}