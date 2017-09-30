package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 22.9.2017 г..
 */
public class milesTokM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int currentHealth = Integer.parseInt(scanner.nextLine());
        int maxHealth = Integer.parseInt(scanner.nextLine());
        int currentEnergy = Integer.parseInt(scanner.nextLine());
        int maxEnergy = Integer.parseInt(scanner.nextLine());

        System.out.printf("Name: %s", name);

        String rem = "";
        for (int i = 0; i < currentHealth; i++) {
            rem += "|";
        }

        for (int i = 0; i < maxHealth - currentHealth; i++) {
            rem += ".";
        }
        System.out.println();
        System.out.printf("Health: |%s|", rem);

        String rem2 = "";
        for (int i = 0; i < currentEnergy; i++) {
            rem2 += "|";
        }

        for (int i = 0; i < maxEnergy - currentEnergy; i++) {
            rem2 += ".";
        }

        System.out.println();
        System.out.printf("Energy: |%s|", rem2);

    }}