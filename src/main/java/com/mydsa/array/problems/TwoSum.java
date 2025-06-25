package com.mydsa.array.problems;

import com.mydsa.array.Array;
import com.mydsa.hashmap.MyHashMap;

public class TwoSum {

    public static int[] twoSum(Array nums, int target) {
        MyHashMap map = new MyHashMap();

        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            int complement = target - num;

            if (map.containsKey(complement)) {
                return new int[] { (int) map.get(complement), i };
            }

            map.put(num, i);  // store value -> index
        }

        return new int[] { -1, -1 };  // not found
    }
}