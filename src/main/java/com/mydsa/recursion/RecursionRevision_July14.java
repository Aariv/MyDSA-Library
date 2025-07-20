package com.mydsa.recursion;

import java.util.Arrays;

public class RecursionRevision_July14 {

	public static void main(String[] args) {
		// 1
		printSth(5);
		System.out.println();
		System.out.println("--------");
		// 2
		print1ToN(5);
		System.out.println("--------");
		System.out.println("--------");
		// 3
		printNto1(5);
		// 4
		System.out.println("--------");
		System.out.println("--------");
		System.out.println(sumOfNatuals(5));
		// 5
		System.out.println("--------");
		System.out.println(factorial(5));
		// 6
		System.out.println("--------");
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("Before:- " + Arrays.toString(arr));
		reverseArray(0, arr.length-1, arr);
		System.out.println("After:- " + Arrays.toString(arr));
		System.out.println("--------");
		// 7
		System.out.println(isPalindrome("MADAM"));
		System.out.println(isPalindrome("MADAN"));
		// 8
		System.out.println("--------");
		System.out.println(fib(4));
		// 9
		System.out.println("--------");
		System.out.println(sumOfArray(arr));
		// 10
		System.out.println("--------");
		System.out.println(revString("Hello"));
		// 11
		System.out.println("--------");
		System.out.println(sumDigits(123));
		System.out.println("KKK"+(1/10));
		// 12
		System.out.println("---------");
		int[] arr1 = {6, 1, 2, 3, 4, 5};
		System.out.println(isArraySorted(arr1));
		// 13
		System.out.println("---------");
		System.out.println(isPrime(13));
		// 14
		System.out.println("---------");
		System.out.println(pow(2, 2));
	}
	
	private static int pow(int n, int x) {
		if(n <= 0) {
			return 1;
		}
		return x * pow(n-1, x);
	}

	private static boolean isPrime(int n) {
		return primeHelper(n, 2);
	}

	private static boolean primeHelper(int n, int i) {
		if(i > Math.sqrt(n)) {
			return true;
		}
		if(n % i == 0) {
			return false;
		}
		return primeHelper(n, i+1);
	}

	private static boolean isArraySorted(int[] arr) {
		return arraySortedHelper(0, arr);
	}

	private static boolean arraySortedHelper(int i, int[] arr) {
		if(i >= arr.length-1) {
			return true;
		}
		if(arr[i] > arr[i+1]) {
			return false;
		}
		return arraySortedHelper(i+1, arr);
	}

	private static int sumDigits(int n) {
		if(n <= 0) {
			return n;
		}
		return (n%10) + sumDigits(n / 10);
	}

	private static String revString(String str) {
		char[] arr = str.toCharArray();
		revHelper(arr, 0, str.length()-1);
		return new String(arr);
	}

	private static void revHelper(char[] charArray, int i, int j) {
		if(i > j) {
			return;
		}
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		revHelper(charArray, i+1, j-1);
	}

	private static int sumOfArray(int[] arr) {
		return sumArrayHelper(arr, 0);
	}

	private static int sumArrayHelper(int[] arr, int idx) {
		if(idx > arr.length-1) {
			return 0;
		}
		return arr[idx] + sumArrayHelper(arr, idx + 1);
	}

	private static int fib(int n) {
	    return fibHelper(n, 0);
	}

	private static int fibHelper(int n, int depth) {
	    String indent = "  ".repeat(depth);
	    System.out.println(indent + "fib(" + n + ")");

	    if (n < 2) {
	        System.out.println(indent + "=> return " + n);
	        return n;
	    }

	    int left = fibHelper(n - 1, depth + 1);
	    int right = fibHelper(n - 2, depth + 1);
	    int result = left + right;

	    System.out.println(indent + "=> fib(" + n + ") = " + left + " + " + right + " = " + result);
	    return result;
	}

//	private static int fib(int n) {
//		System.out.println(n + ":-");
//		if(n < 2) {
//			return n;
//		}
//		return fib(n-1) + fib(n-2);
//	}

	private static boolean isPalindrome(String str) {
		return isPalindrome(0, str.length()-1, str.toCharArray());
	}

	private static boolean isPalindrome(int low, int high, char[] charArray) {
		if(low >= high) {
			return true;
		}
		if(charArray[low] != charArray[high]) {
			return false;
		}
		return isPalindrome(low+1, high-1, charArray);
	}

	private static void reverseArray(int low, int high, int[] arr) {
		if(low >= high) {
			return;
		}
		// Swap
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
		
		reverseArray(low+1, high-1, arr);
	}

	private static int factorial(int n) {
		if(n <= 0) {
			return 1;
		}
		return n * factorial(n-1);
	}

	private static int sumOfNatuals(int n) {
		if(n <= 0) {
			return n;
		}
		return n + sumOfNatuals(n-1);
	}

	private static void printNto1(int n) {
		if(n <= 0) {
			return;
		}
		System.out.print(n + " ");
		printNto1(n-1);
	}

	private static void print1ToN(int n) {
		System.out.println(n + ":-");
		if(n <= 0) {
			return;
		}
		print1ToN(n-1);
		System.out.print(n + " ");
	}

	private static void printSth(int n) {
		System.out.print(n + ":-");
		if(n == 0) {
			return;
		}
		System.out.println("Something..");
		printSth(n-1);
	}
}
