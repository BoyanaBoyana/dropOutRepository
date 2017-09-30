package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 26.9.2017 г..
 */
public class caloriesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int calories = 0;

        for (int i = 0; i < n; i++) {
            String ingredients = scanner.nextLine().toLowerCase();

            if (ingredients.equals("cheese")) {
                calories += 500; }
             else if (ingredients.equals("tomato sauce")) {
                calories += 150;
            } else if (ingredients.equals("salami")) {
                calories += 600;
            } else if (ingredients.equals("pepper")) {
                calories += 50;

            }

        }
        System.out.printf("Total calories: %d", calories);

    }}

