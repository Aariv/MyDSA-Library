package com.mydsa.patterns.slidingwindows;

public class MinSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        // Start both start and end pointers at 0.
        // Expand the window by moving end and adding to sum.
        // While sum >= target, shrink from the left by moving start and updating minLength.
        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
