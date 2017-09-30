package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 22.9.2017 г..
 */
public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if ( grade >= 3.00) {
            System.out.println("Passed!"); } else {
            System.out.println("Failed!"); }
    }
}
