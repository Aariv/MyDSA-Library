package com.mydsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion_July18 {

	public static void main(String[] args) {
		int[] input = {4, 9, 2, 5, 1};
		int target = 10;
		
		System.out.println(combinationSum2(input, target));
	}

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
		
		for(int i = 0; i < input.length; i++) {
			innerArray.add(input[i]);
			combinationSum(input, result, innerArray, target - input[i], i);
			innerArray.remove(innerArray.size() -1);
		}
	}
	
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
