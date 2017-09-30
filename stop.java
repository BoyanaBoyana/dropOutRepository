package com.company;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 21.7.2017 г..
 */
public class stop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSec = Double.parseDouble(scanner.nextLine());
        double lenghtM = Double.parseDouble(scanner.nextLine());
        double timeSecperM = Double.parseDouble(scanner.nextLine());

        double ownTime = lenghtM * timeSecperM;
        double addedTime = Math.round(lenghtM / 15) * 12.5;
        double totalTime = ownTime + addedTime;
        double diff = Math.abs(recordSec - totalTime);

        if ( totalTime <= recordSec)
            System.out.printf(" Yes, he succeeded! The new world record is %.2f seconds.", totalTime );

         else
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff );
        }

    }