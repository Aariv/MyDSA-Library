package com.mydsa.recursion;

public class CountSubsequencesWithSumK {

	public static void main(String[] args) {
		int[] nums = {4, 9, 2, 5, 1};
        int k =10;
        int count = countSubsequences(nums, 0, 0, k);
        System.out.println("Total subsequences with sum " + k + ": " + count);
        System.out.println("Function Call:- " + funcCall); 
    }
	static int funcCall = 0;
    private static int countSubsequences(int[] nums, int start, int currentSum, int target) {
    	funcCall++;
        int count = 0;

        for (int i = start; i < nums.length; i++) {
            int newSum = currentSum + nums[i];

            if (newSum == target) {
                count++; // Found a valid subsequence
            }

            // Recurse forward with next elements, include current
            count += countSubsequences(nums, i + 1, newSum, target);
        }

        return count;
    }
}
