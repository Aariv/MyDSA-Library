package com.mydsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion_July15 {

	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));
		
	}

	public static List<String> generateParenthesis(int n) {
	    List<String> result = new ArrayList<>();
//	    generate("", 0, 0, n, result);
	    generateP(0, 0, "", result, n);
	    return result;
	}

	private static void generate(String current, int open, int close, int max, List<String> result) {
	    if (current.length() == max * 2) {
	        result.add(current);
	        return;
	    }

	    if (open < max) {
	        generate(current + "(", open + 1, close, max, result);
	    }

	    if (close < open) {
	        generate(current + ")", open, close + 1, max, result);
	    }
	}
	
	private static void generateP(int open, int close, String s, List<String> result, int n) {
		if(open == n && close == n) {
			result.add(s);
			return;
		}
		
		if(open < n) {
			generateP(open+1, close, s + "(", result, n);
		}
		
		if(close < open) {
			generateP(open, close + 1, s + ")", result, n);
		}
	}
	

}
