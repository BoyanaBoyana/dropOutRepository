package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 26.9.2017 г..
 */
public class diffNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int combination = 0;

        for (int i = first; i <  second ; i++) {
            for (int j = first; j < second; j++) {
                for (int k = first; k < second; k++) {
                    for (int l = first; l < second; l++) {
                        for (int m = first; m < second; m++) {

                            boolean isValid = (first <= i) && (i < j) && (j < k) && (k < l) && (l < m) && (m <= second);
                            if (isValid) {
                                System.out.printf("%d %d %d %d %d%n", i, j, k, l, m);
                                combination++;

                            }
                        }
                    }
                }}
        }
        if (combination == 0){
            System.out.println("No");
    }}
}
