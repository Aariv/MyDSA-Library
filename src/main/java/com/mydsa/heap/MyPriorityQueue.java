package com.mydsa.heap;

public class MyPriorityQueue {

    private final MyMaxHeap heap;

    public MyPriorityQueue() {
        this.heap = new MyMaxHeap();
    }

    // Add a value to the queue
    public void offer(int value) {
        heap.insert(value);
    }

    // Return the highest priority (max) without removing
    public int peek() {
        return heap.peek();
    }

    // Remove and return the highest priority element
    public int poll() {
        return heap.remove();
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}