package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 26.9.2017 г..
 */
public class triangleOfNUmbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%s ", i);
            }
            System.out.println();
        }

        }

}
