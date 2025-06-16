package com.mydsa.array;

public class Array {
    private int[] data;
    private int size;

    // Initial capacity
    private static final int INITIAL_CAPACITY = 4;

    public Array() {
        this.data = new int[INITIAL_CAPACITY];
        this.size = 0;
    }

    // Add to the end
    public void add(int value) {
        if (size == data.length) {
            resize();
        }
        data[size++] = value;
    }

    // Get element at index
    public int get(int index) {
        checkBounds(index);
        return data[index];
    }

    // Remove element at index
    public void removeAt(int index) {
        checkBounds(index);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1]; // Shift left
        }
        size--;
    }

    // Current number of elements
    public int size() {
        return size;
    }

    // Current capacity
    public int capacity() {
        return data.length;
    }

    // Resize array when full
    private void resize() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i]; // Copy old data
        }
        data = newData;
    }

    // Helper for bounds checking
    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Index " + index + " out of bounds for size " + size);
        }
    }

    // Print for debugging
    public void print() {
        System.out.print("Array: [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("]");
    }
}