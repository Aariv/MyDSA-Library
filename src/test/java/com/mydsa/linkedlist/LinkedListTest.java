package com.mydsa.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LinkedListTest {

    @Test
    public void testAddAndGet() {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(3, list.size());
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(30, list.get(2));
    }

    @Test
    public void testAddFirst() {
        LinkedList list = new LinkedList();
        list.add(100);
        list.addFirst(50);
        list.addFirst(25);

        assertEquals(3, list.size());
        assertEquals(25, list.get(0));
        assertEquals(50, list.get(1));
        assertEquals(100, list.get(2));
    }

    @Test
    public void testRemoveAt() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.removeAt(1); // remove 2
        assertEquals(2, list.size());
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    public void testRemoveAtHead() {
        LinkedList list = new LinkedList();
        list.add(99);
        list.add(100);
        list.removeAt(0);

        assertEquals(1, list.size());
        assertEquals(100, list.get(0));
    }

    @Test
    public void testOutOfBoundsAccess() {
        LinkedList list = new LinkedList();
        list.add(1);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));
        assertThrows(IndexOutOfBoundsException.class, () -> list.removeAt(-1));
    }
}
