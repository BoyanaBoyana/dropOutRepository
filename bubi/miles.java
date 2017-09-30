package com.company.bubi;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 22.9.2017 г..
 */
public class miles {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double volume = Double.parseDouble(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double sugar = Double.parseDouble(scanner.nextLine());

        double energyContent = volume * energy / 100;
        double sugarContent = volume *  sugar / 100 ;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.printf("%sml %s:", decimalFormat.format(volume), name);
        System.out.println();
        System.out.printf("%skcal, %sg sugars",
                decimalFormat.format(energyContent),
                decimalFormat.format(sugarContent));

    }
}
