package com.mydsa.queue;

public class DequeLinkedList {
    private Node head, tail;
    private int size;

    private static class Node {
        int value;
        Node prev, next;

        Node(int value) {
            this.value = value;
        }
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public int removeFirst() {
        if (isEmpty()) throw new RuntimeException("Deque is empty");
        int val = head.value;
        head = head.next;
        if (head == null) tail = null;
        else head.prev = null;
        size--;
        return val;
    }

    public int removeLast() {
        if (isEmpty()) throw new RuntimeException("Deque is empty");
        int val = tail.value;
        tail = tail.prev;
        if (tail == null) head = null;
        else tail.next = null;
        size--;
        return val;
    }

    public int peekFirst() {
        if (isEmpty()) throw new RuntimeException("Deque is empty");
        return head.value;
    }

    public int peekLast() {
        if (isEmpty()) throw new RuntimeException("Deque is empty");
        return tail.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}