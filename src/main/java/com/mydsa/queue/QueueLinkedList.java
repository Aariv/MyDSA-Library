package com.mydsa.queue;

public class QueueLinkedList {
    private Node front, rear;
    private int size;

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void enqueue(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        int val = front.value;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return val;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return front.value;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }
}
