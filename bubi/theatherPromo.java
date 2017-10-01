package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 23.9.2017 г..
 */
public class theatherPromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 0 && age <= 18) {
            switch (dayType) {
                case "Weekday":
                    System.out.println("12$");
                    break;
                case "Weekend":
                    System.out.println("15$");
                    break;
                case "Holiday":
                    System.out.println("5$");
                    break;
            }}
       else if (age > 18 && age <= 64) {
            switch (dayType) {
                case "Weekday":
                    System.out.println("18$");
                    break;
                case "Weekend":
                    System.out.println("20$");
                    break;
                case "Holiday":
                    System.out.println("12$");
                    break;
            }
        }
      else   if (age > 64 && age <= 122) {
            switch (dayType) {
                case "Weekday":
                    System.out.println("12$");
                    break;
                case "Weekend":
                    System.out.println("15$");
                    break;
                case "Holiday":
                    System.out.println("10$");
                    break;
            }

    }
         else

    {
        System.out.println("Error!");
    }


}}