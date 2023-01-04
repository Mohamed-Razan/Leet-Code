package com.leetcode;

public class TwoSum {

	public static void main(String args[]) {
		
		int nums[] = new int[] {2,5,5,11};
		int target = 10;
		
		for(int i = 0; i < twoSum(nums, target).length; i++) {
			System.out.println(twoSum(nums, target)[i]);
		}

	}

	public static int[] twoSum(int[] nums, int target) {
		
		int i, j;
		
		
		for(i = 0; i < nums.length - 1; i++) {
			for(j = 1; j < nums.length; j++) {
				
				if(i == j) {
					continue;
				}
				
				if(nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		
		return null;

	}

}
