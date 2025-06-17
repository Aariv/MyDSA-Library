package com.mydsa.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DoublyLinkedListTest {

    @Test
    public void testAddAndGet() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(5);
        list.add(10);
        list.add(15);

        assertEquals(3, list.size());
        assertEquals(5, list.get(0));
        assertEquals(10, list.get(1));
        assertEquals(15, list.get(2));
    }

    @Test
    public void testAddFirst() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(100);
        list.addFirst(50);
        list.addFirst(25);

        assertEquals(3, list.size());
        assertEquals(25, list.get(0));
        assertEquals(50, list.get(1));
        assertEquals(100, list.get(2));
    }

    @Test
    public void testRemoveAtMiddle() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.removeAt(1); // remove 2
        assertEquals(2, list.size());
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    public void testRemoveAtHeadAndTail() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(11);
        list.add(22);
        list.add(33);

        list.removeAt(0); // remove 11
        list.removeAt(1); // remove 33

        assertEquals(1, list.size());
        assertEquals(22, list.get(0));
    }

    @Test
    public void testOutOfBoundsAccess() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(99);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));
        assertThrows(IndexOutOfBoundsException.class, () -> list.removeAt(5));
    }
}
