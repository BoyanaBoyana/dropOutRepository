package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 26.9.2017 г..
 */
public class countTheInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = 0;

        try {
            while (true){
                int input = Integer.parseInt(scanner.nextLine());
                numCount++;
            }

        } catch (Exception ex){
            System.out.println(numCount);
        }
        
        
    }
}
