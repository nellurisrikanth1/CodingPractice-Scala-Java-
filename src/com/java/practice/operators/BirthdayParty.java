package com.java.practice.operators;

import java.util.Scanner;

/**
 * Mr. X's birthday is in next month. This time he is planning to invite N of his friends. He wants to distribute some chocolates to all of his friends after party. He went to a shop to buy a packet of chocolates.
 * At chocolate shop, each packet is having different number of chocolates. He wants to buy such a packet which contains number of chocolates, which can be distributed equally among all of his friends.
 * Help Mr. X to buy such a packet.
 * <p>
 * Input:
 * First line contains T, number of test cases.
 * Each test case contains two integers, N and M. where is N is number of friends and M is number number of chocolates in a packet.
 * <p>
 * Output:
 * In each test case output "Yes" if he can buy that packet and "No" if he can't buy that packet.
 * <p>
 * Constraints:
 * 1<=T<=20
 * 1<=N<=100
 * 1<=M<=10^5
 */
public class BirthdayParty {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int friends = s.nextInt();
            int chocolates = s.nextInt();
            if (chocolates % friends == 0)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }
}
