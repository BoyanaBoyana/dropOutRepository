package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 25.9.2017 г..
 */
public class cakeIng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ingrediants = scanner.nextLine();
        int counter = 0;
        while (!"Bake!".equals(ingrediants)) {
            counter++;
            System.out.printf("Adding ingredient %s.%n", ingrediants);
            if (counter > 20) {
                return;
            }

        ingrediants = scanner.nextLine();
    }
            System.out.printf("Preparing cake with %d ingredients.", counter);
        }

}

