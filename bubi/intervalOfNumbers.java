package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 25.9.2017 г..
 */
public class intervalOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        if (numberOne<numberTwo) {
        for (int i = numberOne; i <= numberTwo; i++) {
                System.out.println(i); }
            } else {
                for (int j = numberTwo; j <=numberOne ; j++) {
                    System.out.println(j);
                }

                }


        }
    }
