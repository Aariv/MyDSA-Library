package com.mydsa.queue;

import java.util.NoSuchElementException;

public class QueueArray {
    private int[] data;
    private int front, rear, size;

    public QueueArray() {
        data = new int[10];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == data.length) resize();
        data[rear] = value;
        rear = (rear + 1) % data.length;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        int value = data[front];
        front = (front + 1) % data.length;
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        return data[front];
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
