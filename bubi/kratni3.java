package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 23.9.2017 г..
 */
public class kratni3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int currentNumber = 1;

        for (int i = 1; i <= n; i++) {

                System.out.println(currentNumber);
                sum += currentNumber;
                currentNumber +=2;


        }
        System.out.println("Sum: " + sum);
    }}
