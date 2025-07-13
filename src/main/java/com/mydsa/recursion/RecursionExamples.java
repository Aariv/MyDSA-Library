package com.mydsa.recursion;

public class RecursionExamples {

	public static void main(String[] args) {
		int n = 5, x = 2;
		// 2 * 2 * 2 * 2 * 2
		System.out.println(pow(x, n));
	}

	private static int pow(int x, int n) {
		if(n <= 0) {
			return 1;
		}
		return x * pow(x, n-1);
	}
}
