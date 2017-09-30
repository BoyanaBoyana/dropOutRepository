package com.company;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 18.7.2017 г..
 */
public class transportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km = Double.parseDouble(scanner.nextLine());
        String dayNight = scanner.nextLine();

        double taxiPriceD = 0.70 + 0.79*km;
        double taxiPriceN = 0.70 + 0.90*km;
        double bus = 0.09*km;
        double vlak = 0.06*km;

        switch (dayNight) {
            case "day":
                if (km< 20)
                    System.out.println(taxiPriceD);
                    if (km >= 20 && km < 100)
                        System.out.println(bus);
                        if (km >=100)
                            System.out.println(vlak);
                        break;
            case "night":
                if (km< 20)
                    System.out.println(taxiPriceN);
                if (km >= 20 && km < 100)
                    System.out.println(bus);
                if (km >=100)
                    System.out.println(vlak);
                break;
                        }
                    }

                }
