package com.mydsa.stack;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackArrayTest {

    @Test
    public void testPushAndPeek() {
        StackArray stack = new StackArray();
        stack.push(42);
        stack.push(84);

        assertEquals(84, stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    public void testPop() {
        StackArray stack = new StackArray();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        StackArray stack = new StackArray();
        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPopEmptyThrowsException() {
        StackArray stack = new StackArray();
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    public void testPeekEmptyThrowsException() {
        StackArray stack = new StackArray();
        assertThrows(EmptyStackException.class, stack::peek);
    }

    @Test
    public void testDynamicResize() {
        StackArray stack = new StackArray();
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }

        assertEquals(100, stack.size());
        assertEquals(99, stack.peek());
    }
}
