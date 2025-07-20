package com.mydsa.recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Recursion_July16 {

	public static void main(String[] args) {
		List<String> result = generateParentheses(2);
        for (String s : result) {
            System.out.println(s);
        }
        
        System.out.println("-============");
        
        int n = 3;
        List<String> binaryStrings = generateBinaryStrings(n);
        for (String s : binaryStrings) {
            System.out.println(s);
        }
	}
	
	static class Node {
        String str;
        int open, close;

        Node(String str, int open, int close) {
            this.str = str;
            this.open = open;
            this.close = close;
        }
    }
	
	public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        stack.push(new Node("", 0, 0));

        while (!stack.isEmpty()) {
            Node current = stack.pop();

            if (current.open == n && current.close == n) {
                result.add(current.str);
                continue;
            }

            // Push next possibilities onto the stack
            if (current.open < n) {
                stack.push(new Node(current.str + "(", current.open + 1, current.close));
            }

            if (current.close < current.open) {
                stack.push(new Node(current.str + ")", current.open, current.close + 1));
            }
        }

        return result;
    }
	
	public static List<String> generateBinaryStrings(int n) {
        List<String> result = new ArrayList<>();
        Queue<StringBuilder> queue = new LinkedList<>();

        queue.add(new StringBuilder());

        while (!queue.isEmpty()) {
            StringBuilder current = queue.poll();

            if (current.length() == n) {
                result.add(current.toString());
                continue;
            }

            // Create copies before modifying to simulate recursion safely
            StringBuilder sb0 = new StringBuilder(current).append('0');
            StringBuilder sb1 = new StringBuilder(current).append('1');

            queue.add(sb0);
            queue.add(sb1);
        }

        return result;
    }
}
