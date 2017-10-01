package com.company;

import java.io.DataOutput;
import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 19.7.2017 г..
 */
public class grapeRakia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squareM = Double.parseDouble(scanner.nextLine());
        double kilos = Double.parseDouble(scanner.nextLine());
        double waste = Double.parseDouble(scanner.nextLine());


        double afterWaste = (squareM * kilos) - waste;
        double rakia = (afterWaste * 0.45) / 7.5;
        double income = rakia * 9.8;

        double incomeTwo =( afterWaste * 0.55) * 1.5 ;

        System.out.printf("%.2f", income);
        System.out.println();
        System.out.printf("%.2f", incomeTwo);


    }
}
