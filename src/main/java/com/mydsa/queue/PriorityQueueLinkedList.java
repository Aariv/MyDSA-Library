package com.mydsa.queue;

public class PriorityQueueLinkedList {
    private static class Node {
        int value;
        Node next;
        Node(int val) { this.value = val; }
    }

    private Node head;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null || value < head.value) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.value <= value) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public int poll() {
        if (isEmpty()) throw new RuntimeException("Empty Queue");
        int val = head.value;
        head = head.next;
        return val;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Empty Queue");
        return head.value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        Node node = head;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
}