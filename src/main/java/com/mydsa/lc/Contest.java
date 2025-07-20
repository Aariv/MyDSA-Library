package com.mydsa.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	static final int MOD = 1_000_000_007;

    public int countTrapezoids(int[][] points) {
        Map<Integer, Integer> yCount = new HashMap<>();

        // Step 1: Count number of points per y-level
        for (int[] point : points) {
            int y = point[1];
            yCount.put(y, yCount.getOrDefault(y, 0) + 1);
        }

        // Step 2: Calculate C(n, 2) for all y-levels with >= 2 points
        List<Long> combs = new ArrayList<>();
        for (int count : yCount.values()) {
            if (count >= 2) {
                long comb = ((long) count * (count - 1) / 2) % MOD;
                combs.add(comb);
            }
        }

        // Step 3: Use math trick to compute sum of comb[i] * comb[j] for i < j
        long sum = 0;
        long squareSum = 0;

        for (long c : combs) {
            sum = (sum + c) % MOD;
            squareSum = (squareSum + (c * c) % MOD) % MOD;
        }

        long result = ((sum * sum) % MOD - squareSum + MOD) % MOD;
        result = (result * invMod(2, MOD)) % MOD;

        return (int) result;
    }

    // Helper: modular inverse of 2 under MOD
    private long invMod(long a, int mod) {
        return powMod(a, mod - 2, mod);
    }

    private long powMod(long base, long exp, int mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
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
