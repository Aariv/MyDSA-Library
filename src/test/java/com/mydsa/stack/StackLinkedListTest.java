package com.mydsa.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackLinkedListTest {

    @Test
    public void testPushAndPeek() {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    public void testPop() {
        StackLinkedList stack = new StackLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        StackLinkedList stack = new StackLinkedList();
        assertTrue(stack.isEmpty());

        stack.push(99);
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPopEmptyThrowsException() {
        StackLinkedList stack = new StackLinkedList();
        assertThrows(RuntimeException.class, stack::pop);
    }

    @Test
    public void testPeekEmptyThrowsException() {
        StackLinkedList stack = new StackLinkedList();
        assertThrows(RuntimeException.class, stack::peek);
    }
}