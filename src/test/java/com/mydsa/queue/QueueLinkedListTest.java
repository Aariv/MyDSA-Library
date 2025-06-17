package com.mydsa.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueLinkedListTest {

    @Test
    public void testEnqueueAndPeek() {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(5);
        queue.enqueue(10);

        assertEquals(5, queue.peek());
        assertEquals(2, queue.size());
    }

    @Test
    public void testDequeue() {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        QueueLinkedList queue = new QueueLinkedList();
        assertTrue(queue.isEmpty());

        queue.enqueue(99);
        assertFalse(queue.isEmpty());

        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testDequeueEmptyThrowsException() {
        QueueLinkedList queue = new QueueLinkedList();
        assertThrows(RuntimeException.class, queue::dequeue);
    }

    @Test
    public void testPeekEmptyThrowsException() {
        QueueLinkedList queue = new QueueLinkedList();
        assertThrows(RuntimeException.class, queue::peek);
    }
}