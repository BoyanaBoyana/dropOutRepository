package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 18.7.2017 г..
 */
public class onTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int chasArrival = Integer.parseInt(scanner.nextLine());
        int minArrival = Integer.parseInt(scanner.nextLine());

        int diff = (hours*60 - minutes)  - (chasArrival* 60 - minArrival) ;
        int hour = Math.abs(diff/60);
        int min = Math.abs(diff%60);

        if ( diff == 0) {
            System.out.println("On time");


        }


        }
    }
