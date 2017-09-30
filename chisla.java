package com.company;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 21.7.2017 г..
 */
public class chisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;


            if (operator.equals("+")) {
                result = (N + N2);
            if (operator.equals("-"))
                result = (N - N2);
            if (operator.equals("*"))
                result = (N * N2);
            if (result % 2 == 0)
                System.out.println(N + " " + operator + " " + N2 + " " + "=" + " " + result + " " + "-" + " " + "even");
            else
                System.out.println(N + " " + operator + " " + N2 + " " + "=" + " " + result + " " + "-" + " " + "odd");

        }
        if (operator.equals("/")) {
            result = (N / N2);
            System.out.printf(N + " " + operator + " " + N2 + " " + "=" + " " + "%.2f", result);
            {

            }
            if (operator.equals("%")) {
                result = N % N2;
                System.out.printf(N + " " + operator + " " + N2 + " " + "=" + " " +  result);

            }
        }
    }}