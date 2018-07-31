package com.java.practice.implem;

import java.util.Scanner;

public class MaxProfit {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int maxI = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            int inp = s.nextInt();
            nums[i]=inp;
            if (inp > max) {
                max = inp;
                maxI = i;
            }
        }
        for (int i = 0; i < maxI; i++) {
            if (nums[i] < min)
                min = nums[i];
        }
        System.out.println(max - min);
    }
}
