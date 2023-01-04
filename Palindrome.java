package com.leetcode;

public class Palindrome {

	public static void main(String args[]) {
		
		System.out.println(isPalindrome(1211));

	}

	public static boolean isPalindrome(int x) {

		if(x < 0) {
			return false;
		}
		
		else {
			String str = String.valueOf(x);
			for(int i = 0, j = str.length() - 1; i < j; i++, j--) {
				if(str.charAt(i) != str.charAt(j)) {
					return false;
				}
				
			}
		}
		
		return true;
	}

}
