package com.mydsa.lc;

public class Contest {
	
	public static void main(String[] args) {
		Contest c = new Contest();
		System.out.println(c.checkDivisibility(99));
//		isDivisible(99);
	}
	
	public static boolean isDivisible(int n) {
        int original = n;
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        int total = sum + product;
        return original % total == 0;
    }

	public boolean checkDivisibility(int n) {
		int sum = sum(n);
		int product = product(n);
		int total = sum + product;
		return n % total == 0;
	}

	private int product(int n) {
		if(n == 0) 
			return 1;
		return n % 10 * product(n/10);
	}

	private int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n % 10 + sum(n / 10);
	}
}
