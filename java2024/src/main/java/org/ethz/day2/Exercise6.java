package org.ethz.day2;

import java.util.Scanner;

public class Exercise6 {

    public static boolean isValidPassword(String password) {
        // Rule 1: Password must have at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        // Rule 2: Password must contain at least one digit
        boolean containsDigit = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                containsDigit = true;
                break;
            }
        }
        if (!containsDigit) {
            return false;
        }

        // Rule 3: Password must not contain a '.' character
        if (password.contains(".")) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String userPassword = scanner.nextLine();

        if (isValidPassword(userPassword)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
        scanner.close();
    }
}
