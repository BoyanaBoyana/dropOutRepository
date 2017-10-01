package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 24.9.2017 г..
 */
public class restaurantDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String Package = scanner.nextLine();
        double discount = 0;
        double packagePrize = 0;
        double price = 0;
        double hallprice =0;


        switch (Package) {
            case ("Normal"):
                discount = 0.05;
                packagePrize = 500;
                break;
            case ("Gold"):
                discount = 0.1;
                packagePrize = 750;
                break;
            case ("Platinum"):
                discount = 0.15;
                packagePrize = 1000;
                break;
        }
            if (groupSize <= 50) {
                hallprice = 2500;
                System.out.println("We can offer you the Small Hall");
            } else if (groupSize>50 && groupSize <=100) {
            hallprice = 5000;
                System.out.println("We can offer you the Terrace");
            } else if (groupSize>100 && groupSize<=120) {
            hallprice = 7500;
                System.out.println("We can offer you the Great Hall");
            } else if (groupSize>120){
                System.out.println("We do not have an appropriate hall.");
            }
        double totDiscount = (packagePrize + hallprice ) * discount;
        double total = (packagePrize+ hallprice) - totDiscount;
        double ppp = total / groupSize;
        if (groupSize <120) {
        System.out.printf("The price per person is %.2f$", ppp);
    }}
}