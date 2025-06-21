package com.mydsa.heap;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyMinHeapTest {

    @Test
    public void testInsertAndPeek() {
        MyMinHeap heap = new MyMinHeap();
        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(3);

        assertEquals(3, heap.peek());
    }

    @Test
    public void testRemove() {
        MyMinHeap heap = new MyMinHeap();
        heap.insert(15);
        heap.insert(10);
        heap.insert(30);
        heap.insert(5);

        assertEquals(5, heap.remove());
        assertEquals(10, heap.remove());
        assertEquals(15, heap.remove());
        assertEquals(30, heap.remove());
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testSizeAndIsEmpty() {
        MyMinHeap heap = new MyMinHeap();
        assertEquals(0, heap.size());
        assertTrue(heap.isEmpty());

        heap.insert(100);
        heap.insert(50);
        assertEquals(2, heap.size());
        assertFalse(heap.isEmpty());

        heap.remove();
        assertEquals(1, heap.size());
    }

    @Test
    public void testDynamicResize() {
        MyMinHeap heap = new MyMinHeap();
        for (int i = 20; i >= 1; i--) {
            heap.insert(i);
        }
        assertEquals(1, heap.peek());
        assertEquals(20, heap.size());

        for (int i = 1; i <= 20; i++) {
            assertEquals(i, heap.remove());
        }
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testPeekAndRemoveOnEmpty() {
        MyMinHeap heap = new MyMinHeap();

        assertThrows(IllegalStateException.class, heap::peek);
        assertThrows(IllegalStateException.class, heap::remove);
    }
}