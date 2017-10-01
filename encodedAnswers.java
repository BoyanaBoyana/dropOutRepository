package com.company;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 20.7.2017 г..
 */
public class encodedAnswers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int a =1; int b =1;int c =1;int d =1;

        for (int i = 0; i < n ; i++) {
            if (n % 4 == 0)
                for (int k = a; k < a ; k++)
                    System.out.print(a);

            if (n % 4 ==1 )
                for (int k = b; k < b ; k++)
                    System.out.print(b);
            if (n%4 ==2)
                for (int l = c; l< c ; l++)
                    System.out.print(c);
                    if (n % 4 == 3)
                        for (int j = d; j < d ; j++)
                            System.out.print(d);



                }}}
