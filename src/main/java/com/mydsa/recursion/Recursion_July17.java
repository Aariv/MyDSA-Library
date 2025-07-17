package com.mydsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion_July17 {

	public static void main(String[] args) {
		// Subset
		int[] arr = {1, 2, 3};
		System.out.println(subSet(arr));
	}

	private static List<List<Integer>> subSet(int[] arr) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> innerArray = new ArrayList<Integer>();
		int index = 0;
		subSetHelper(arr, innerArray, result, index);
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
	
}
