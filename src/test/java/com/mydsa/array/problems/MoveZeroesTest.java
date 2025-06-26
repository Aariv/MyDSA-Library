package com.mydsa.array.problems;

import com.mydsa.array.Array;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MoveZeroesTest {

    @Test
    public void testBasicCase() {
        Array arr = new Array();
        arr.add(0);
        arr.add(1);
        arr.add(0);
        arr.add(3);
        arr.add(12);

        MoveZeroes.moveZeroes(arr);
        assertArrayEquals(new int[] {1, 3, 12, 0, 0}, arr.toArray());
    }

    @Test
    public void testNoZeroes() {
        Array arr = new Array();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        MoveZeroes.moveZeroes(arr);
        assertArrayEquals(new int[] {1, 2, 3}, arr.toArray());
    }

    @Test
    public void testAllZeroes() {
        Array arr = new Array();
        arr.add(0);
        arr.add(0);
        arr.add(0);

        MoveZeroes.moveZeroes(arr);
        assertArrayEquals(new int[] {0, 0, 0}, arr.toArray());
    }

    @Test
    public void testEmpty() {
        Array arr = new Array();
        MoveZeroes.moveZeroes(arr);
        assertEquals(0, arr.size());
    }
}