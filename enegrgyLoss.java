package com.company;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 23.7.2017 г..
 */
public class enegrgyLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int trainDays = Integer.parseInt(scanner.nextLine());
        int dancersCount = Integer.parseInt(scanner.nextLine());
        int energyWaste = 0;
        int energyTotal = trainDays * energyWaste;
        int totalEnergyAll = 100 * trainDays * dancersCount;



        for (int i= 0;  i <trainDays ; i++) {
            scanner.nextLine();

        if ( trainDays %2 ==0 && i % 2 == 0 ) {
            energyWaste = 68*dancersCount;
        if ( trainDays %2 !=0 && i % 2 == 0 )
            energyWaste = 49*dancersCount;
        if ( trainDays %2 ==0 && i % 2 != 0 )
            energyWaste = 65*dancersCount;
        if ( trainDays %2 !=0 && i % 2 != 0 )
            energyWaste = 30*dancersCount;
                }

            int unusedEnergy = totalEnergyAll - (energyWaste* i);
        int unusedEdancer= unusedEnergy/ trainDays/dancersCount;
            System.out.println(unusedEdancer);
        }}}