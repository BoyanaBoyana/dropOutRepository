package com.company;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 19.7.2017 г..
 */
public class styrophoam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double ploshtKushta = Double.parseDouble(scanner.nextLine());
        int windows = Integer.parseInt(scanner.nextLine());
        double phoamPermeter = Double.parseDouble(scanner.nextLine());
        double pricePerPack = Double.parseDouble(scanner.nextLine());


        double neededMaterial = ploshtKushta - (windows * 2.4);
        double MaterialAll = (neededMaterial*0.1) + neededMaterial;
        double packets = Math.round(MaterialAll / phoamPermeter*100)/100;
        double finalPrice = packets  *pricePerPack;

        if (finalPrice <= budget) {

            System.out.printf("Spent: %.2f", finalPrice);
            System.out.println();
            System.out.printf("Left: %.2f", budget - finalPrice);

        }else {
            System.out.printf("Need more: %.2f", Math.abs(finalPrice-budget));
        }

        }

    }
