package com.company;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 20.7.2017 г..
 */
public class garfieldMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyJohnGaveToGarfield = Double.parseDouble(scanner.nextLine());
        double excahngeRate = Double.parseDouble(scanner.nextLine());
        double pizzaPrice = Double.parseDouble(scanner.nextLine())/excahngeRate;
        double lasagnaPrice = Double.parseDouble(scanner.nextLine())/excahngeRate;
        double sandwichPrice = Double.parseDouble(scanner.nextLine())/excahngeRate;
        double pizzaQuantity = Double.parseDouble(scanner.nextLine());
        double lasagnaQuantity = Double.parseDouble(scanner.nextLine());
        double sandwichQuantity = Double.parseDouble(scanner.nextLine());

        double foodTotal$ = ((pizzaPrice* pizzaQuantity) + (lasagnaPrice* lasagnaQuantity)
                + (sandwichPrice * sandwichQuantity));

        if (foodTotal$ < moneyJohnGaveToGarfield)

            System.out.printf("Garfield is well fed, John is awesome. Money left: " + "$%.2f.", moneyJohnGaveToGarfield-foodTotal$);

        else if (foodTotal$ >= moneyJohnGaveToGarfield)
            System.out.printf("Garfield is hungry. John is a badass. Money needed: " + "$%.2f.",
                    foodTotal$-moneyJohnGaveToGarfield);
        }
    }
