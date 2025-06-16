package com.mydsa.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {

    @Test
    public void testAddAndGet() {
        Array arr = new Array();
        arr.add(5);
        arr.add(10);
        arr.add(15);

        assertEquals(3, arr.size());
        assertEquals(5, arr.get(0));
        assertEquals(10, arr.get(1));
        assertEquals(15, arr.get(2));
    }

    @Test
    public void testResize() {
        Array arr = new Array();
        for (int i = 0; i < 10; i++) {
            arr.add(i * 2);
        }

        assertEquals(10, arr.size());
        assertTrue(arr.capacity() >= 10);

        for (int i = 0; i < 10; i++) {
            assertEquals(i * 2, arr.get(i));
        }
    }

    @Test
    public void testRemoveAt() {
        Array arr = new Array();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        arr.removeAt(1); // Remove value 2
        assertEquals(3, arr.size());
        assertEquals(3, arr.get(1));
        assertEquals(4, arr.get(2));
    }

    @Test
    public void testRemoveAtOutOfBounds() {
        Array arr = new Array();
        arr.add(1);
        arr.add(2);

        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            arr.removeAt(2);
        });

        assertTrue(exception.getMessage().contains("out of bounds"));
    }

    @Test
    public void testGetOutOfBounds() {
        Array arr = new Array();
        arr.add(42);

        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            arr.get(1);
        });

        assertTrue(exception.getMessage().contains("out of bounds"));
    }

    @Test
    public void testCapacityIncreasesCorrectly() {
        Array arr = new Array();
        int initialCapacity = arr.capacity();

        for (int i = 0; i <= initialCapacity; i++) {
            arr.add(i);
        }

        assertTrue(arr.capacity() > initialCapacity);
    }
}