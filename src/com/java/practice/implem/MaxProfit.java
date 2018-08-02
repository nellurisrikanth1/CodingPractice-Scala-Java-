package com.java.practice.implem;

import java.util.Scanner;

/**
 * Given an array where each indices represent a day and elements of array represent price of stocks on previous day.Prince decided to buy a stock and then sell that stock  to earn maximum profit.Your task is to find out maximum profit which he can earn.
 *
 *
 * Input Format:
 * Line 1 : Integer N(Size of array)
 * Line 2 : N integers which are elements of array
 *
 * Constraints:
 *
 *
 * Output Format:
 *  Integer(max profit)
 */
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
