package com.mydsa.recursion;

public class RecursionExample {

    public static void main(String[] args) {
        print();
    }
    static int count = 0;
    private static void print() {
        // base condition - stop the recursion
        if(count == 4) {
            return;
        }
        System.out.println(count);
        count++;
        print();
    }
}
