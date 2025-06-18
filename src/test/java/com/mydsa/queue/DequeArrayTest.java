package com.mydsa.queue;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class DequeArrayTest {

    @Test
    public void testAddFirstAndRemoveFirst() {
        DequeArray deque = new DequeArray();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        assertEquals(3, deque.removeFirst());
        assertEquals(2, deque.removeFirst());
        assertEquals(1, deque.removeFirst());
        assertTrue(deque.isEmpty());
    }

    @Test
    public void testAddLastAndRemoveLast() {
        DequeArray deque = new DequeArray();
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);

        assertEquals(30, deque.removeLast());
        assertEquals(20, deque.removeLast());
        assertEquals(10, deque.removeLast());
        assertTrue(deque.isEmpty());
    }

    @Test
    public void testMixedOperations() {
        DequeArray deque = new DequeArray();
        deque.addLast(1);   // rear = 1
        deque.addFirst(0);  // front = 0
        deque.addLast(2);   // rear = 2

        assertEquals(0, deque.peekFirst());
        assertEquals(2, deque.peekLast());

        assertEquals(0, deque.removeFirst());
        assertEquals(2, deque.removeLast());
        assertEquals(1, deque.removeFirst());
    }

    @Test
    public void testResizing() {
        DequeArray deque = new DequeArray();
        for (int i = 0; i < 20; i++) {
            deque.addLast(i);
        }

        assertEquals(0, deque.peekFirst());
        assertEquals(19, deque.peekLast());
        assertEquals(20, deque.size());
    }

    @Test
    public void testExceptions() {
        DequeArray deque = new DequeArray();

        assertThrows(NoSuchElementException.class, deque::removeFirst);
        assertThrows(NoSuchElementException.class, deque::removeLast);
        assertThrows(NoSuchElementException.class, deque::peekFirst);
        assertThrows(NoSuchElementException.class, deque::peekLast);
    }
}