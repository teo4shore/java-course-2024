package org.ethz.day1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer larger than 0: ");
        int number = scanner.nextInt();

        int result = 1;

        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            result *= digit;           // Multiply it to the result
            number /= 10;              // Remove the last digit
        }
   
    System.out.println("The product of the digits is: " + result);
    scanner.close();
    }
}


