package com.leetcode;

import java.util.Stack;

public class BalanceBracket {

	public static void main(String[] args) {

		System.out.println(isValid("{[(])}"));

	}

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.add(s.charAt(i));
			}
			
			else {
				if(stack.isEmpty()) {
					return false;
				}
				
				else {
					if((s.charAt(i) == ')' && stack.peek() == '(') || (s.charAt(i) == ']' && stack.peek() == '[') || (s.charAt(i) == '}' && stack.peek() == '{')) {
						stack.pop();
					}
					
					else {
						return false;
					}
				}
			}
		}
		
		return stack.isEmpty() ? true : false;
	}

}
