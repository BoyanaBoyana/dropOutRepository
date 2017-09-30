package com.company;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 21.7.2017 г..
 */
public class plochki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine()); //дължина на страна на площадка
        double W = Double.parseDouble(scanner.nextLine()); //широчина на плочка
        double L = Double.parseDouble(scanner.nextLine()); //дължината на една плочка
        int M = Integer.parseInt(scanner.nextLine()); // широчина на пейка
        int O = Integer.parseInt(scanner.nextLine()); //дължина на пейка

        int ploshtadkakvm = N * N;
        int ploshtpeika = M * O;
        double ploshtplochka = W * L;

        int pokrivaemaplosht = ploshtadkakvm - ploshtpeika;
        double neobhodimiPlochki = pokrivaemaplosht / ploshtplochka;

        double neobhodimoVreme = neobhodimiPlochki * 0.2;
        System.out.printf("%.2f", neobhodimiPlochki);
        System.out.println();
        System.out.printf("%.2f", neobhodimoVreme );


    }
}
