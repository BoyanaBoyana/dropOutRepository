package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 25.9.2017 г..
 */
public class chooseADrink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String proffession = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double water = 0.70*quantity;
        double coffee = 1.00*quantity;
        double beer = 1.70 *quantity;
        double tea = 1.20*quantity;

        if (proffession.equals("Athlete")){
            System.out.printf("The %s has to pay %.2f.", proffession, water);
        } else if (proffession.equals("SoftUni Student")){
            System.out.printf("The %s has to pay %.2f.", proffession, beer);
        } else if (proffession.equals("Chef")){
            System.out.printf("The %s has to pay %.2f.", proffession, tea);
        } else if (proffession.equals("Businessman")||(proffession.equals("Businesswoman"))) {
            System.out.printf("The %s has to pay %.2f.", proffession, coffee);
        } else {
            System.out.printf("The %s has to pay %.2f.", proffession, tea);
        }


    }
}