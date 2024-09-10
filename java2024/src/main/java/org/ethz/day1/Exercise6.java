package org.ethz.day1;

import java.util.Random;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        // Create a Scanner object to read the secret number from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0-1000): ");
        int secretNumber = scanner.nextInt();

        Random random = new Random();
        int guess;
        int attempts = 0;

        do {
            guess = random.nextInt(1000);
            attempts++; 
            System.out.println("Guess #" + attempts + ": " + guess); 
        } while (guess != secretNumber); 

        System.out.println("The program guessed the number: " + secretNumber);
        System.out.println("It took " + attempts + " tries to guess it");
        scanner.close();
    }
}

