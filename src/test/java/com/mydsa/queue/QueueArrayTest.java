package com.mydsa.queue;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class QueueArrayTest {

    @Test
    public void testEnqueueAndPeek() {
        QueueArray queue = new QueueArray();
        queue.enqueue(100);
        queue.enqueue(200);

        assertEquals(100, queue.peek());
        assertEquals(2, queue.size());
    }

    @Test
    public void testDequeue() {
        QueueArray queue = new QueueArray();
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
        QueueArray queue = new QueueArray();
        assertTrue(queue.isEmpty());

        queue.enqueue(77);
        assertFalse(queue.isEmpty());

        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testDequeueEmptyThrowsException() {
        QueueArray queue = new QueueArray();
        assertThrows(NoSuchElementException.class, queue::dequeue);
    }

    @Test
    public void testPeekEmptyThrowsException() {
        QueueArray queue = new QueueArray();
        assertThrows(NoSuchElementException.class, queue::peek);
    }

    @Test
    public void testWrapAroundAndResize() {
        QueueArray queue = new QueueArray();

        // Fill initial array and dequeue a few
        for (int i = 0; i < 10; i++) queue.enqueue(i);
        for (int i = 0; i < 5; i++) queue.dequeue();

        // Cause wrap-around
        for (int i = 10; i < 15; i++) queue.enqueue(i);

        assertEquals(5, queue.peek());
        assertEquals(10, queue.size());

        // Cause resize
        queue.enqueue(100);
        queue.enqueue(101);
        queue.enqueue(102);

        assertEquals(13, queue.size());
        assertEquals(5, queue.peek());
    }
}