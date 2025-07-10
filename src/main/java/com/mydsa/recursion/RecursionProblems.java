package com.mydsa.recursion;

public class RecursionProblems {

    public static void main(String[] args) {
        int n = 5; // Example value for n
        String name = "John"; // Example name
        System.out.println("Printing name " + n + " times:");
        printName(name, n);
        System.out.println("==========================");
        print1toN(n);
        System.out.println("==========================");
        printNto1(n);
        System.out.println("==========================");
        // Sum is 1 + 2 + 3 + 4 => 10.
        System.out.print(sumOfN(4));

    }

    private static void printNto1(int n) {
        // Base condition - stop the recursion
        if(n <= 0) {
            return;
        }
        // Print the current value of n before the recursive call
        System.out.println(n);
        // Recursive call with n decremented by 1
        printNto1(n - 1);
    }

    private static void print1toN(int n) {
        // Base condition - stop the recursion
        if(n <= 0) {
            return;
        }
        // Recursive call with n decremented by 1
        print1toN(n - 1);
        // Print the current value of n after the recursive call
        System.out.println(n);
    }

    // Time Complexity - O(n) and Space Complexity - O(n) for recursion stack
    // Print name n times using recursion
    public static void printName(String name, int n) {
        // Base condition - stop the recursion
        if(n <= 0) {
            return;
        }
        System.out.println(name);
        // Recursive call with n decremented by 1
        printName(name, n - 1);
    }

    public static int sumOfN(int n) {
        // Base condition - stop the recursion
        if(n <= 0) {
            return 0;
        }
        // Recursive call with n decremented by 1 and adding n to the result
        return n + sumOfN(n - 1);
    }
}
