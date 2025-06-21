package com.mydsa.heap;

public class MyMaxHeap {

    private int[] heap;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyMaxHeap() {
        heap = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    // Insert a value and maintain heap property
    public void insert(int value) {
        ensureCapacity();
        heap[size] = value;
        bubbleUp(size);
        size++;
    }

    // Return the largest value without removing it
    public int peek() {
        if (isEmpty()) throw new IllegalStateException("Heap is empty");
        return heap[0];
    }

    // Remove and return the largest value
    public int remove() {
        if (isEmpty()) throw new IllegalStateException("Heap is empty");
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        bubbleDown(0);
        return max;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // ========== Helper Methods ==========

    private void bubbleUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heap[index] > heap[parentIndex]) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void bubbleDown(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;

        if (left < size && heap[left] > heap[largest]) largest = left;
        if (right < size && heap[right] > heap[largest]) largest = right;

        if (largest != index) {
            swap(index, largest);
            bubbleDown(largest);
        }
    }

    private void ensureCapacity() {
        if (size >= heap.length) {
            int[] newHeap = new int[heap.length * 2];
            for (int i = 0; i < heap.length; i++) {
                newHeap[i] = heap[i];
            }
            heap = newHeap;
        }
    }

    private void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }
}