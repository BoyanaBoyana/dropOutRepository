package com.company;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 20.7.2017 г..
 */
public class truckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int gameYears = 30000;
        int weekendDays = n * 127;
        int worksDays = (365 - n) * 63;
        int result = weekendDays + worksDays;
        int lastResult = Math.abs(gameYears - result);
        int hour = lastResult / 60;
        int minutes = lastResult % 60 ;

        if (gameYears >= result)
        {
            System.out.println("Tom sleeps well");
            System.out.println( hour + " " + "hours and " +  minutes + " minutes less for play");
        }
        else
        {
            System.out.println("Tom will run away");
            System.out.println( hour +" "+ "hours and " + minutes +" minutes more for play");
        }
    }
}