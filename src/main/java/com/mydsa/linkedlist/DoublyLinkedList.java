package com.mydsa.linkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private static class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    // Add to end
    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    // Add to beginning
    public void addFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    // Get value at index
    public int get(int index) {
        checkBounds(index);
        Node curr = getNode(index);
        return curr.value;
    }

    // Remove node at index
    public void removeAt(int index) {
        checkBounds(index);
        Node curr = getNode(index);

        if (curr.prev != null) {
            curr.prev.next = curr.next;
        } else {
            head = curr.next;
        }

        if (curr.next != null) {
            curr.next.prev = curr.prev;
        } else {
            tail = curr.prev;
        }

        size--;
    }

    // Helper to get node by index (O(n))
    private Node getNode(int index) {
        Node curr;
        if (index < size / 2) {
            curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
        } else {
            curr = tail;
            for (int i = size - 1; i > index; i--) {
                curr = curr.prev;
            }
        }
        return curr;
    }

    public int size() {
        return size;
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
    }

    public void printForward() {
        System.out.print("Forward: ");
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ⇄ ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        System.out.print("Backward: ");
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.value + " ⇄ ");
            curr = curr.prev;
        }
        System.out.println("null");
    }
}