package com.mydsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion_July17 {

	public static void main(String[] args) {
		// Subset
		int[] arr = {2, 3};
		int i = 1;
		for(List<Integer> set : subSet(arr)) {
			System.out.println((i) + ":"+ set);
			i++;
		}
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
		innerArray = new ArrayList<Integer>(innerArray);
		result.add(innerArray);
		for(int i = index; i < arr.length; i++) {
			innerArray.add(arr[i]);
			subSetHelper(arr, innerArray, result, i + 1);
			innerArray.remove(innerArray.size()-1);
		}
	}
	
	// Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
	// The solution set must not contain duplicate subsets. Return the solution in any order.
	private static List<List<Integer>> subSet2(int[] arr) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> innerArray = new ArrayList<Integer>();
		int index = 0;
		Arrays.sort(arr);
		subSetHelper2(arr, innerArray, result, index);
		return result;
	}

	private static void subSetHelper2(int[] arr, List<Integer> innerArray, List<List<Integer>> result, int index) {
		innerArray = new ArrayList<Integer>(innerArray);
		result.add(innerArray);
		for (int i = index; i < arr.length; i++) {
			if (i > index && arr[i] == arr[i - 1]) {
				continue;
			}
			innerArray.add(arr[i]);
			subSetHelper(arr, innerArray, result, i + 1);
			innerArray.remove(innerArray.size() - 1);

		}
	}
	
}
