package com.mydsa.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class DequeLinkedListTest {

    @Test
    public void testAddFirstAndRemoveFirst() {
        DequeLinkedList deque = new DequeLinkedList();
        deque.addFirst(10);
        deque.addFirst(20);
        deque.addFirst(30);

        assertEquals(30, deque.removeFirst());
        assertEquals(20, deque.removeFirst());
        assertEquals(10, deque.removeFirst());
        assertTrue(deque.isEmpty());
    }

    @Test
    public void testAddLastAndRemoveLast() {
        DequeLinkedList deque = new DequeLinkedList();
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
        DequeLinkedList deque = new DequeLinkedList();
        deque.addFirst(1);  // front = 1
        deque.addLast(2);   // front = 1, rear = 2
        deque.addFirst(0);  // front = 0

        assertEquals(0, deque.peekFirst());
        assertEquals(2, deque.peekLast());

        assertEquals(0, deque.removeFirst());
        assertEquals(2, deque.removeLast());
        assertEquals(1, deque.removeFirst());
    }

    @Test
    public void testExceptions() {
        DequeLinkedList deque = new DequeLinkedList();

        assertThrows(RuntimeException.class, deque::removeFirst);
        assertThrows(RuntimeException.class, deque::removeLast);
        assertThrows(RuntimeException.class, deque::peekFirst);
        assertThrows(RuntimeException.class, deque::peekLast);
    }
}