package com.mydsa.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriorityQueueLinkedListTest {

    @Test
    public void testInsertAndPoll() {
        PriorityQueueLinkedList pq = new PriorityQueueLinkedList();
        pq.insert(7);
        pq.insert(2);
        pq.insert(9);
        pq.insert(1);

        assertEquals(1, pq.poll());
        assertEquals(2, pq.poll());
        assertEquals(7, pq.poll());
        assertEquals(9, pq.poll());
        assertTrue(pq.isEmpty());
    }

    @Test
    public void testPeek() {
        PriorityQueueLinkedList pq = new PriorityQueueLinkedList();
        pq.insert(4);
        pq.insert(6);
        pq.insert(3);

        assertEquals(3, pq.peek());
        assertEquals(3, pq.peek()); // Peek shouldn't remove
    }

    @Test
    public void testEmptyPollAndPeek() {
        PriorityQueueLinkedList pq = new PriorityQueueLinkedList();

        assertThrows(RuntimeException.class, pq::poll);
        assertThrows(RuntimeException.class, pq::peek);
    }

    @Test
    public void testSize() {
        PriorityQueueLinkedList pq = new PriorityQueueLinkedList();
        assertEquals(0, pq.size());

        pq.insert(11);
        pq.insert(13);
        pq.insert(9);
        assertEquals(3, pq.size());

        pq.poll();
        assertEquals(2, pq.size());
    }
}