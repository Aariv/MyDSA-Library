package com.mydsa.graph;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MyGraphTraversalTest {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private MyGraph graph;

    @Before
    public void setup() {
        System.setOut(new PrintStream(output));

        graph = new MyGraph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        graph.addEdge("D", "E");
    }

    @Test
    public void testDFS() {
        graph.dfs("A");
        String expected = "DFS from A: A B D E C\n";
        assertEquals(expected, output.toString());
    }

    @Test
    public void testBFS() {
        graph.bfs("A");
        String expected = "BFS from A: A B C D E\n";
        assertEquals(expected, output.toString());
    }

    @Test
    public void testDFSDisconnected() {
        graph.addVertex("Z");
        output.reset();
        graph.dfs("Z");
        String expected = "DFS from Z: Z\n";
        assertEquals(expected, output.toString());
    }

    @Test
    public void testBFSDisconnected() {
        graph.addVertex("Z");
        output.reset();
        graph.bfs("Z");
        String expected = "BFS from Z: Z\n";
        assertEquals(expected, output.toString());
    }
}