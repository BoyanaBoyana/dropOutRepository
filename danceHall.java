package com.company;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 23.7.2017 г..
 */
public class danceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double money1 = 0;
        double money=0;
        double procent = 0;

        if (season.equals("summer") && (place.equals("Bulgaria")))
            procent = 0.05;
            money = dancers * points;
            if (season.equals("winter") && (place.equals("Bulgaria")))
               procent = 0.08;
             money = dancers * points;
            if (season.equals("summer") && (place.equals("Abroad")))
                procent = 0.1;
        money1 = (dancers * points);
            if (season.equals("winter") && (place.equals("Abroad")))
                procent = 0.15;
        money = (dancers * points);



            double razhodi = money - (money * procent);
            double charity = 0.75 * razhodi;
            double moneyLeft = razhodi - charity;
            double dancersSalary = moneyLeft / dancers;


            System.out.printf("Charity - %.2f", charity);
            System.out.println();
            System.out.printf("Money per dancer - %.2f", dancersSalary);
        }
    }

