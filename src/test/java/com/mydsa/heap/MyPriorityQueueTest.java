package com.mydsa.heap;

import org.junit.*;

import static org.junit.Assert.*;

public class MyPriorityQueueTest {

    @Test
    public void testOfferAndPeek() {
        MyPriorityQueue pq = new MyPriorityQueue();
        pq.offer(10);
        pq.offer(50);
        pq.offer(30);

        assertEquals(50, pq.peek());
    }

    @Test
    public void testPoll() {
        MyPriorityQueue pq = new MyPriorityQueue();
        pq.offer(40);
        pq.offer(20);
        pq.offer(60);

        assertEquals(60, pq.poll());
        assertEquals(40, pq.poll());
        assertEquals(20, pq.poll());
        assertTrue(pq.isEmpty());
    }

    @Test
    public void testSizeAndEmpty() {
        MyPriorityQueue pq = new MyPriorityQueue();
        assertTrue(pq.isEmpty());

        pq.offer(5);
        pq.offer(10);

        assertEquals(2, pq.size());
        pq.poll();
        assertEquals(1, pq.size());
    }

    @Test
    public void testPeekAndPollEmpty() {
        MyPriorityQueue pq = new MyPriorityQueue();

        assertThrows(IllegalStateException.class, pq::peek);
        assertThrows(IllegalStateException.class, pq::poll);
    }
}