package com.mydsa.array.problems;

import com.mydsa.array.Array;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testTwoSumExample() {
        Array input = new Array();
        input.add(2);
        input.add(7);
        input.add(11);
        input.add(15);

        int[] result = TwoSum.twoSum(input, 9);
        assertArrayEquals(new int[] {0, 1}, result);
    }

    @Test
    public void testTwoSumNotFound() {
        Array input = new Array();
        input.add(1);
        input.add(2);
        input.add(3);

        int[] result = TwoSum.twoSum(input, 10);
        assertArrayEquals(new int[] {-1, -1}, result);
    }

    @Test
    public void testTwoSumWithDuplicates() {
        Array input = new Array();
        input.add(3);
        input.add(3);

        int[] result = TwoSum.twoSum(input, 6);
        assertArrayEquals(new int[] {0, 1}, result);
    }
}