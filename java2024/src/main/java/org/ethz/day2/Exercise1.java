package org.ethz.day2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        String unicodeHex = Integer.toHexString(character);
        System.out.println("Unicode value (hexadecimal): " + unicodeHex.toUpperCase());
        scanner.close();
    }
}


