package com.company.bubi;

import java.util.Scanner;

/**
 * Created by Acer-E1-571G on 25.9.2017 г..
 */
public class worldInPlural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().trim();

        if (word.endsWith("y")) {
            word = word.substring(0, word.length() - 1);
            word += "ies";
        } else if (word.endsWith("o") || word.endsWith("s") ||
                 word.endsWith("x") || word.endsWith("z") || word.endsWith("ch") ||
                word.endsWith("sh") ) {

            word += "es";
        } else {
            word += "s";

        }
        System.out.println(word);
    }
}
