package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 28.9.2017 г..
 */
public class magicNum {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int firstNum = Integer.parseInt(scan.nextLine());
    int secondNum = Integer.parseInt(scan.nextLine());
    int magicNum = Integer.parseInt(scan.nextLine());
    int combinationsCount = 0;

    for (int i = secondNum; i >= firstNum ; i--) {
        for (int j = secondNum; j >= firstNum ; j--) {

            combinationsCount++;

            if (i+j == magicNum){
                System.out.printf("Number found! %d + %d = %d", i, j, magicNum);
                return;
            }
        }
    }

    System.out.printf("%d combinations - neither equals %d", combinationsCount, magicNum);
}
}

