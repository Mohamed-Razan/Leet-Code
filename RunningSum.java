package com.leetcode;

import java.util.Scanner;

public class RunningSum {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int n, i;
        n = scan.nextInt();
        int input[] = new int[n];
        for(i = 0; i < n; i++){
            input[i] = scan.nextInt();
        }

        int result[] = runningSum(input);
        for(i = 0; i < n; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] runningSum(int[] nums) {
        int sumResults[] = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            sumResults[i] = sum;
        }
        return sumResults;
    }
}
