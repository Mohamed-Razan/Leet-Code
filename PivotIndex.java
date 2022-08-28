package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PivotIndex {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int n, i;
        n = scan.nextInt();
        int input[] = new int[n];
        for(i = 0; i < n; i++){
            input[i] = scan.nextInt();
        }

//        int result[] = runningSum(input);
//        for(i = 0; i < n; i++){
//            System.out.println(result[i]);
//        }
        System.out.println(pivotIndex(input));
    }

    public static int pivotIndex(int[] nums) {

        int i;

        for(i = 0; i < nums.length; i++){

            Integer[] leftArray = IntStream.range(0, i)
                    .mapToObj(j -> nums[j])
                    .toArray(Integer[]::new);

            Integer[] rightArray = IntStream.range(i+1, nums.length)
                    .mapToObj(j -> nums[j])
                    .toArray(Integer[]::new);

            if(sumOfArray(leftArray) == sumOfArray(rightArray)){
                return i;
            }
        }
        return -1;
    }

    public static int sumOfArray(Integer[] arr){
        int i, sum = 0;

        for(i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
