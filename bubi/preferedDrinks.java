package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 24.9.2017 г..
 */
public class preferedDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String proffesion = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double CoffeePrice = 1.00 * quantity;
        double WaterPrice = 0.70 * quantity;
        double BeerPrice = 1.70 * quantity;
        double teaPrice = 1.20 * quantity;



        if (proffesion.equals("Businessman") ) {
            System.out.printf(("The Businessman has to pay %.2f."), CoffeePrice);
        } else if (proffesion.equals("Businesswoman")) {
            System.out.printf(("The Businesswoman has to pay %.2f."), CoffeePrice);
        } else if (proffesion.equals("SoftUni Student")) {
            System.out.printf(("The SoftUni Student has to pay %.2f."), BeerPrice);
        } else if (proffesion.equals("Athlete")) {
            System.out.printf(("The Athlete has to pay %.2f."), WaterPrice);
        } else if (proffesion.equals("Chef")){
            System.out.printf(("The Chef has to pay %.2f."), teaPrice);


        }
    }
}