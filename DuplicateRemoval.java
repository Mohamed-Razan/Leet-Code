package com.leetcode;

import java.util.Arrays;

public class DuplicateRemoval {

	public static void main(String[] args) {

		int arr[] = new int[] {1,1,2};
		System.out.println(removeDuplicates(arr));
		int k = removeDuplicates(arr);
		
		for(int i = 0; i < k - 1; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int removeDuplicates(int[] nums) {

		int prev = -1000, count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(prev != nums[i]) {
				count++;
				prev = nums[i];
				
			}
			else {
				nums[i] = 1000;
			}
		}
		Arrays.sort(nums);
		return count;
	}

}
