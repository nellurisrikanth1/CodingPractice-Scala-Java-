package com.java.practice.implem;

import java.util.Scanner;

/**
 * Gary likes to solve problems of array, but he doesn't like problems that involve queries. His school teacher gave him an assignment full of problems but one of them involve queries. Can you help Gary in solving that problem so that he can go and play with his friends? The problem is :
 *
 * Given an Array A consisting of N positive integers, you have to answer Q queries on it. Queries can be of the two types: * 1 X Y - Update X at location Y in the array. * 2 L R - Print the sum of range [L, R], i.e. Both L and R are inclusive.
 *
 * Note:- Array indexing is from 0.
 * Input:
 *
 *     The first line contains two space separated integers N(Length of Array) and Q(Queries).
 *     Next Line contains N space separated integers denoting array A.
 *     Next Q Line contains 3 space separated integers for each line, as described above
 * Output: Answer to the each query of type 2 in a new line, only when range is valid, otherwise ouput `-1`
 *
 * Constraints: 1 <= N <= 10^9 1 <= Q <= 10^5 1 <= A[i], X, Y, L, R <= 10^5
 */
public class ArrayInsert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int qs = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        for (int i = 0; i < qs; i++) {
            int type = s.nextInt();
            if (type == 1) {
                int x = s.nextInt();
                int y = s.nextInt();
                nums[x] = y;
            } else {
                int left = s.nextInt();
                int right = s.nextInt();
                int sum = nums[right];
                for (int j = left; j < right; j++) {
                    sum += nums[j];
                }
                System.out.println(sum);
            }
        }
    }
}
