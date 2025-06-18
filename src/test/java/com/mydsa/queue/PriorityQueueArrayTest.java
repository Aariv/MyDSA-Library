package com.mydsa.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriorityQueueArrayTest {

    @Test
    public void testInsertAndPoll() {
        PriorityQueueArray pq = new PriorityQueueArray();
        pq.insert(10);
        pq.insert(5);
        pq.insert(15);
        pq.insert(1);

        assertEquals(1, pq.poll());
        assertEquals(5, pq.poll());
        assertEquals(10, pq.poll());
        assertEquals(15, pq.poll());
        assertTrue(pq.isEmpty());
    }

    @Test
    public void testPeek() {
        PriorityQueueArray pq = new PriorityQueueArray();
        pq.insert(8);
        pq.insert(3);
        pq.insert(10);

        assertEquals(3, pq.peek());
        assertEquals(3, pq.peek()); // Ensure peek doesn't remove
    }

    @Test
    public void testEmptyPollAndPeek() {
        PriorityQueueArray pq = new PriorityQueueArray();

        assertThrows(RuntimeException.class, pq::poll);
        assertThrows(RuntimeException.class, pq::peek);
    }

    @Test
    public void testSize() {
        PriorityQueueArray pq = new PriorityQueueArray();
        assertEquals(0, pq.size());

        pq.insert(1);
        pq.insert(2);
        assertEquals(2, pq.size());

        pq.poll();
        assertEquals(1, pq.size());
    }
}