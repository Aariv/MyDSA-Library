package com.mydsa.queue;

import java.util.NoSuchElementException;

public class DequeArray {
    private int[] data;
    private int front, rear, size;

    public DequeArray() {
        data = new int[10];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void addFirst(int value) {
        if (size == data.length) resize();
        front = (front - 1 + data.length) % data.length;
        data[front] = value;
        size++;
    }

    public void addLast(int value) {
        if (size == data.length) resize();
        data[rear] = value;
        rear = (rear + 1) % data.length;
        size++;
    }

    public int removeFirst() {
        if (isEmpty()) throw new NoSuchElementException("Deque is empty");
        int val = data[front];
        front = (front + 1) % data.length;
        size--;
        return val;
    }

    public int removeLast() {
        if (isEmpty()) throw new NoSuchElementException("Deque is empty");
        rear = (rear - 1 + data.length) % data.length;
        int val = data[rear];
        size--;
        return val;
    }

    public int peekFirst() {
        if (isEmpty()) throw new NoSuchElementException("Deque is empty");
        return data[front];
    }

    public int peekLast() {
        if (isEmpty()) throw new NoSuchElementException("Deque is empty");
        int idx = (rear - 1 + data.length) % data.length;
        return data[idx];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void resize() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i) % data.length];
        }
        data = newData;
        front = 0;
        rear = size;
    }
}