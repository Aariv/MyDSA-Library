package com.mydsa.queue;

public class PriorityQueueArray {
    private int[] heap;
    private int size;

    public PriorityQueueArray() {
        heap = new int[10];
        size = 0;
    }

    public void insert(int value) {
        ensureCapacity();
        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    public int poll() {
        if (isEmpty()) throw new RuntimeException("Empty Queue");
        int min = heap[0];
        heap[0] = heap[--size];
        heapifyDown(0);
        return min;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Empty Queue");
        return heap[0];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (size == heap.length) {
            int[] newHeap = new int[heap.length * 2];
            System.arraycopy(heap, 0, newHeap, 0, heap.length);
            heap = newHeap;
        }
    }

    private void heapifyUp(int index) {
        while (index > 0 && heap[index] < heap[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private void heapifyDown(int index) {
        while (leftChild(index) < size) {
            int smaller = leftChild(index);
            if (rightChild(index) < size && heap[rightChild(index)] < heap[smaller]) {
                smaller = rightChild(index);
            }
            if (heap[index] <= heap[smaller]) break;
            swap(index, smaller);
            index = smaller;
        }
    }

    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }
    private void swap(int i, int j) {
        int tmp = heap[i]; heap[i] = heap[j]; heap[j] = tmp;
    }
}