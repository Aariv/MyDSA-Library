package com.mydsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {

	public static void main(String[] args) {
		int[] arr = {3, 1, 2};
		int n = 3;
		List<Integer> arrList = new ArrayList<Integer>();
		subSeq(0, arrList, arr, n);
	}

	private static void subSeq(int i, List<Integer> arrList, int[] arr, int n) {
		if(i == n) {
			for(int ele: arrList) {
				System.out.print(ele + " ");
			}
			if(arrList.size() == 0) {
				System.out.print("{}");
			}
			System.out.println();
			return;
		}
		// take or pick the index into subsequence
		arrList.addLast(arr[i]);
		subSeq(i+1, arrList, arr, n);
		arrList.removeLast();
		// not pick or not take and not added into the subsequence
		subSeq(i+1, arrList, arr, n);
	}
}
