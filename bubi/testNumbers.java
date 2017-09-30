package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 28.9.2017 г..
 */
public class testNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int maxSumnum = Integer.parseInt(scanner.nextLine());
        int multi = 0;
        int combinationsCount = 0;

        for (int i = m; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {

                multi += (3 * i * j);
                combinationsCount++;

                if (multi >= maxSumnum) {
                    System.out.printf("%d combinations%n", combinationsCount);
                    System.out.printf("Sum: %d >= %d", multi, maxSumnum);
                    return;

                }
            }
        } System.out.printf("%d combinations%n", combinationsCount);
        System.out.printf("Sum: %d", multi);}}