package com.mydsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion_July18 {

	public static void main(String[] args) {
		int[] input = {4, 2, 10, 5, 1, 3};
		int target = 5;
		
		System.out.println(combinationSum2(input, target));
	}

	// Given an array of distinct integers candidates and a target integer target, 
	// return a list of all unique combinations of candidates where the chosen numbers sum to target. 
	// You may return the combinations in any order.
	private static List<List<Integer>> combinationSum(int[] input, int target) {
		List<Integer> innerArray = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		combinationSum(input, result, innerArray, target, 0);
		return result;
	}

	private static void combinationSum(int[] input, List<List<Integer>> result, List<Integer> innerArray, int target,
			int index) {
		if(target == 0) {
			result.add(new ArrayList<Integer>(innerArray));
			return;
		}
		if(target < 0)
			return;
		
		for(int i = index; i < input.length; i++) {
			innerArray.add(input[i]);
			combinationSum(input, result, innerArray, target - input[i], i);
			innerArray.remove(innerArray.size() -1);
		}
	}
	
	// Given a collection of candidate numbers (candidates) and a target number (target), 
	// find all unique combinations in candidates where the candidate numbers sum to target.
	// Each number in candidates may only be used once in the combination.

	private static List<List<Integer>> combinationSum2(int[] input, int target) {
		List<Integer> innerArray = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(input);
		combinationSum2(input, result, innerArray, target, 0);
		return result;
	}

	private static void combinationSum2(int[] input, List<List<Integer>> result, List<Integer> innerArray, int target,
			int index) {
		if(target == 0) {
			result.add(new ArrayList<Integer>(innerArray));
			return;
		}
		if(target < 0)
			return;
		
		for(int i = index; i < input.length; i++) {
			// To maintain distinct
			if(i > index && input[i] == input[i-1]) {
				continue;
			}
			innerArray.add(input[i]);
			combinationSum2(input, result, innerArray, target - input[i], i+1);
			innerArray.remove(innerArray.size() -1);
		}
	}

	// Find all valid combinations of k numbers that sum up to n such that the following conditions are true:
	// Only numbers 1 through 9 are used.
	// Each number is used at most once.
	private static List<List<Integer>> combinationSum3(int k, int n) {
		List<Integer> innerArray = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		combinationSum3(k, result, innerArray, n, 1);
		return result;
	}

	private static void combinationSum3(int k, List<List<Integer>> result, List<Integer> innerArray, int target,
			int index) {
		if(target == 0 && innerArray.size() == k) {
			result.add(new ArrayList<Integer>(innerArray));
			return;
		}
		if(target < 0 || innerArray.size() > k)
			return;
		
		for(int i = index; i <= 9; i++) {
			innerArray.add(i);
			combinationSum3(k, result, innerArray, target - i, i+1);
			innerArray.remove(innerArray.size() -1);
		}
	}
}
