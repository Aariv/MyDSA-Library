package com.mydsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetGenerator {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
//        generateSubsets(nums, 0, new ArrayList<>(), result);
        result = subSet(nums);

        System.out.println("Final subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    private static void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // Print the current state before diving deeper
        System.out.println("Index: " + index + " | Current: " + current);

        // Base case: if we've gone through all elements
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            System.out.println(">> Adding to result: " + current);
            return;
        }

        // ✅ Include current number
        current.add(nums[index]);
        System.out.println("Include " + nums[index]);
        generateSubsets(nums, index + 1, current, result);

        // ❌ Exclude current number (backtrack)
        current.remove(current.size() - 1);
        System.out.println("Exclude " + nums[index]);
        generateSubsets(nums, index + 1, current, result);
    }
    
    // Given an integer array nums of unique elements, return all possible subsets (the power set).
 	// The solution set must not contain duplicate subsets. Return the solution in any order.
 	private static List<List<Integer>> subSet(int[] arr) {
 		List<List<Integer>> result = new ArrayList<List<Integer>>();
 		List<Integer> innerArray = new ArrayList<Integer>();
 		subSetHelper(arr, innerArray, result, 0);
 		return result;
 	}

 	private static void subSetHelper(int[] arr, List<Integer> innerArray, List<List<Integer>> result, int index) {
 	// Print the current state before diving deeper
        System.out.println("Index: " + index + " | Current: " + innerArray);
 		result.add(new ArrayList<Integer>(innerArray));
 		for(int i = index; i < arr.length; i++) {
 			System.out.println("Include " + arr[index]);
 			innerArray.add(arr[i]);
 			subSetHelper(arr, innerArray, result, i + 1);
 			innerArray.remove(innerArray.size()-1);
 			System.out.println("Exclude " + arr[index]);
 		}
 	}
}