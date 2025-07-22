package com.mydsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class ParenthesesGenerator {

	public static void main(String[] args) {
		int n = 2;
		List<String> out = generateParentheses(n);
		System.out.println(out);
	}

	private static List<String> generateParentheses(int n) {
		List<String> outArray = new ArrayList<String>();
		generate(n, "", 0, 0, outArray);
		return outArray;
	}

	private static void generate(int n, String s, int open, int close, List<String> outArray) {
		if(open == n && close == n) {
			outArray.add(s);
			return;
		}
		if(open < n ) {
			generate(n, s + "(", open+1, close, outArray);
		}
		if(close < open) {
			generate(n, s + ")", open, close+1, outArray);
		}
	}
}
