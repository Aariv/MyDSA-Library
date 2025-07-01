package com.mydsa.patterns.slidingwindows;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinSizeSubarraySumTest {

    @Test
    public void testExample() {
        int[] nums = {2,3,1,2,4,3};
        assertEquals(2, MinSizeSubarraySum.minSubArrayLen(7, nums));
    }

    @Test
    public void testNoSubarray() {
        int[] nums = {1, 1, 1, 1};
        assertEquals(0, MinSizeSubarraySum.minSubArrayLen(10, nums));
    }

    @Test
    public void testWholeArrayNeeded() {
        int[] nums = {1, 2, 3, 4};
        assertEquals(2, MinSizeSubarraySum.minSubArrayLen(7, nums));
    }

    @Test
    public void testSingleElementMatch() {
        int[] nums = {1, 4, 4};
        assertEquals(1, MinSizeSubarraySum.minSubArrayLen(4, nums));
    }
}