package com.mydsa.linkedlist;

public class LinkedList

{
    private Node head;
    private int size;

    // Inner class
    private static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    // Add to end
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }

    // Add to beginning
    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Get value at index
    public int get(int index) {
        checkBounds(index);
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.value;
    }

    // Remove node at index
    public void removeAt(int index) {
        checkBounds(index);
        if (index == 0) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
    }

    public int size() {
        return size;
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }
    }

    public void print() {
        Node curr = head;
        System.out.print("List: ");
        while (curr != null) {
            System.out.print(curr.value + " → ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
