package org.ethz.day2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the first three letters of the month (first letter uppercase): ");
        String month = scanner.next();

        int days = 0;

        switch (month) {
            case "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec" -> days = 31;
            case "Apr", "Jun", "Sep", "Nov" -> days = 30;
            case "Feb" -> {
                // Check if it's a leap year
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
            }
            default -> {
                System.out.println("Invalid month entered.");
                System.exit(0);
            }
        }

        System.out.println("Number of days in " + month + " " + year + ": " + days);
        scanner.close();
    }

    // Helper method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
