package com.mydsa.stack;

import java.util.EmptyStackException;
import java.util.Arrays;

public class StackArray {
    private int[] arr;
    private int top;

    public StackArray() {
        arr = new int[10];
        top = -1;
    }

    public void push(int value) {
        if (top + 1 == arr.length) {
            resize();
        }
        arr[++top] = value;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    private void resize() {
        arr = Arrays.copyOf(arr, arr.length * 2);
    }
}
