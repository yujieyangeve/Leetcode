package com.lc.test;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {

        //358764
        int[] nums = new int[]{3,2,1};
        nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }


    public static void nextPermutation(int[] nums) {
        int start = 0;
        int n = nums.length;
        while (start < n) {
            int next = start + 1;
            if (next < n && nums[next] >= nums[start]) {
                start++;
                continue;
            }

            int exchange = start - 1;
            if (exchange >= 0 && next < n - 1) {
                Arrays.sort(nums, start, n);
                while (start < n && nums[exchange] > nums[start]) {
                    start++;
                    continue;
                }
                swap(nums, exchange, start);
                return;
            } else {
                if (nums[exchange] < nums[start]){
                    swap(nums, start, exchange);
                }
                else Arrays.sort(nums);
                return;
            }
        }
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
