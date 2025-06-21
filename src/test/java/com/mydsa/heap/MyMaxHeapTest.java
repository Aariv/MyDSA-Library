package com.mydsa.heap;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyMaxHeapTest {

    @Test
    public void testInsertAndPeek() {
        MyMaxHeap heap = new MyMaxHeap();
        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(30);

        assertEquals(30, heap.peek());
    }

    @Test
    public void testRemove() {
        MyMaxHeap heap = new MyMaxHeap();
        heap.insert(5);
        heap.insert(15);
        heap.insert(10);
        heap.insert(25);

        assertEquals(25, heap.remove());
        assertEquals(15, heap.remove());
        assertEquals(10, heap.remove());
        assertEquals(5, heap.remove());
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testSizeAndIsEmpty() {
        MyMaxHeap heap = new MyMaxHeap();
        assertEquals(0, heap.size());
        assertTrue(heap.isEmpty());

        heap.insert(42);
        heap.insert(100);
        assertEquals(2, heap.size());
        assertFalse(heap.isEmpty());

        heap.remove();
        assertEquals(1, heap.size());
    }

    @Test
    public void testDynamicResize() {
        MyMaxHeap heap = new MyMaxHeap();
        for (int i = 1; i <= 20; i++) {
            heap.insert(i);
        }

        assertEquals(20, heap.size());
        assertEquals(20, heap.peek());

        for (int i = 20; i >= 1; i--) {
            assertEquals(i, heap.remove());
        }

        assertTrue(heap.isEmpty());
    }

    @Test
    public void testPeekAndRemoveOnEmpty() {
        MyMaxHeap heap = new MyMaxHeap();

        assertThrows(IllegalStateException.class, heap::peek);
        assertThrows(IllegalStateException.class, heap::remove);
    }
}