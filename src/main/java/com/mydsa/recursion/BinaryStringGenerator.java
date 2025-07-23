package com.mydsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class BinaryStringGenerator {

	public static void generateBinaryStrings(int n) {
//		generate("", n);
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<String>();
		generateB(sb, n, list);
		System.out.println(list);
	}

	private static void generate(String current, int n) {
		if (current.length() == n) {
			System.out.println(current);
			return;
		}

		generate(current + "0", n); // Add '0' and continue
		generate(current + "1", n); // Add '1' and continue
	}

	public static void main(String[] args) {
		int n = 2;
		generateBinaryStrings(n);
	}
	
	private static void generateB(StringBuilder sb, int n, List<String> list) {
		if(sb.length() == n) {
			list.add(sb.toString());
			return;
		}
		
		sb.append("0");
		generateB(sb, n, list);
		
		// Remove
		sb.deleteCharAt(sb.length()-1);
		
		sb.append("1");
		generateB(sb, n, list);
		// Remove
		sb.deleteCharAt(sb.length()-1);
	}
}
