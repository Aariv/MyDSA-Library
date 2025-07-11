package com.mydsa.recursion;

import java.util.Arrays;

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
        System.out.println("==========================");
        int[] arr = {1, 2, 3, 4, 5};
        reverse(0, n - 1, arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("==========================");

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

    public static int factorial(int n) {
        // Base condition - stop the recursion
        if(n <= 1) {
            return 1;
        }
        // Recursive call with n decremented by 1 and multiplying n with the result
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        // Base condition - stop the recursion
        if(n <= 1) {
            return n;
        }
        // Recursive call to calculate the nth Fibonacci number
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int power(int base, int exponent) {
        // Base condition - stop the recursion
        if(exponent == 0) {
            return 1;
        }
        // Recursive call to calculate base raised to the power of exponent
        return base * power(base, exponent - 1);
    }

    public static int gcd(int a, int b) {
        // Base condition - stop the recursion
        if(b == 0) {
            return a;
        }
        // Recursive call to calculate GCD using Euclidean algorithm
        return gcd(b, a % b);
    }

    public static void reverse(int low, int high, int[] arr) {
        // Base condition - stop the recursion
        if(low >= high) {
            return;
        }
        // Swap the elements at low and high indices
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        // Recursive call with low incremented and high decremented
        reverse(low + 1, high - 1, arr);
    }

    public static boolean isPalindrome(String str, int left, int right) {
        // Base condition - stop the recursion
        if(left >= right) {
            return true;
        }
        // Check if characters at left and right indices are equal
        if(str.charAt(left) != str.charAt(right)) {
            return false;
        }
        // Recursive call with left incremented and right decremented
        return isPalindrome(str, left + 1, right - 1);
    }

    public static int sumOfDigits(int n) {
        // Base condition - stop the recursion
        if(n == 0) {
            return 0;
        }
        // Recursive call to calculate the sum of digits
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void generateParentheses(int n, int open, int close, StringBuilder current) {
        // Base condition - stop the recursion
        if(current.length() == 2 * n) {
            System.out.println(current.toString());
            return;
        }
        // If we can add an opening parenthesis
        if(open < n) {
            current.append('(');
            generateParentheses(n, open + 1, close, current);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
        // If we can add a closing parenthesis
        if(close < open) {
            current.append(')');
            generateParentheses(n, open, close + 1, current);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
    }

    // Check if there exists a subsequence with sum K
    public static boolean isSubsetSum(int[] arr, int n, int sum) {
        // Base condition - if sum is 0, we found a subset
        if(sum == 0) {
            return true;
        }
        // If no elements left or sum becomes negative
        if(n == 0 || sum < 0) {
            return false;
        }
        // Exclude the last element and check
        boolean exclude = isSubsetSum(arr, n - 1, sum);
        // Include the last element and check
        boolean include = isSubsetSum(arr, n - 1, sum - arr[n - 1]);
        return include || exclude;
    }
}
