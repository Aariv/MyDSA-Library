package com.mydsa.array.problems;

import com.mydsa.array.Array;

public class MoveZeroes {

    public static void moveZeroes(Array arr) {
        int insertPos = 0;

        // Move non-zero elements forward
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != 0) {
                arr.set(insertPos++, arr.get(i));
            }
        }

        // Fill remaining with 0s
        while (insertPos < arr.size()) {
            arr.set(insertPos++, 0);
        }
    }
}