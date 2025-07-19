package com.mydsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion_July19 {

	public static void main(String[] args) {
		// Count all subsequences with sum K
		int[] arr = {2, 3};
		int target = 10;
		System.out.println(subSetSum(arr));
	}
	
	// Given an array nums and an integer k.Return the number of non-empty subsequences of nums such that the sum of all elements in the subsequence is equal to k.
	private static int subsequenceSumK(int[] input, int target) {
		List<Integer> innerArray = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		subsequenceSumK(input, result, innerArray, target, 0);
		return result.size();
	}

	private static void subsequenceSumK(int[] input, List<List<Integer>> result, List<Integer> innerArray, int target,
			int index) {
		if(target == 0) {
			result.add(new ArrayList<Integer>(innerArray));
			return;
		}
		if(target < 0)
			return;
		
		for(int i = index; i < input.length; i++) {
			innerArray.add(input[i]);
			subsequenceSumK(input, result, innerArray, target - input[i], i+1);
			innerArray.remove(innerArray.size() -1);
		}
	}

	//Given an array nums and an integer k. R﻿eturn true if there exist subsequences such that the sum of all elements in subsequences is equal to k else false.
	private static boolean subsequenceSumKExists(int[] input, int target) {
		List<Integer> innerArray = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		subsequenceSumKExists(input, result, innerArray, target, 0);
		return result.size() > 0;
	}

	private static void subsequenceSumKExists(int[] input, List<List<Integer>> result, List<Integer> innerArray, int target,
			int index) {
		if(target == 0) {
			result.add(new ArrayList<Integer>(innerArray));
			return;
		}
		if(target < 0)
			return;
		
		for(int i = index; i < input.length; i++) {
			innerArray.add(input[i]);
			subsequenceSumK(input, result, innerArray, target - input[i], i+1);
			innerArray.remove(innerArray.size() -1);
		}
	}
	
	// Given an array nums of n integers.Return sum of all subsets of the array nums.
	private static List<Integer> subSetSum(int[] arr) {
		List<Integer> result = new ArrayList<Integer>();
		int index = 0;
		subSetSumHelper(arr, 0, result, index);
		return result;
	}

	private static void subSetSumHelper(int[] arr, int sum,
										List<Integer> result, int index) {
		result.add(sum);
		for(int i = index; i < arr.length; i++) {
			subSetSumHelper(arr, sum+arr[i], result, i + 1);
		}
	}
}
