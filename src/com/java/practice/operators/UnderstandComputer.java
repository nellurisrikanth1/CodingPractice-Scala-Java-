package com.java.practice.operators;

import java.util.Scanner;

/**
 * Mr. ABC was recently learning about computer division. Considering the basic model of the computer suppose we wish to divide a number X by D i.e X/D and obtain the result (Note that it is integer division i.e result of 7/2 will be 3).
 *
 * Now the computer will give the divide overflow error if:
 *
 * The number of bits in the binary representation(without appending any leading zeroes) of the resulting number(quotient) is greater than the number of bits in the binary representation of divisor(D) (Without appending any leading zeroes).
 *
 * Now Mr. ABC is given an integer X for T testcases .He wishes to find number of such divisors D(1<=D<=X) for which divide overflow will not occur.
 *
 * CONSTRAINTS :
 *
 *
 *
 * INPUT:
 *
 * The first line contains the integer T , the number of test cases.
 *
 * In next T lines, each line contains an integer X.
 *
 * OUTPUT:
 *
 * Print the required output for each testcase in new line.
 */
public class UnderstandComputer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            long j;
            long n = s.nextLong();
            int ans = 0;
            for (j = 1; j <= Math.sqrt(n); j *= 2) ;
            if (n / j >= j / 2) System.out.println(n - n / j);
            else System.out.println(n - j / 2 + 1);
        }
    }
}
