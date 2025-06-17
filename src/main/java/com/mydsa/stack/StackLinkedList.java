package com.mydsa.stack;

public class StackLinkedList {
    private Node top;
    private int size;

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void push(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
        size++;
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        int val = top.value;
        top = top.next;
        size--;
        return val;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}
