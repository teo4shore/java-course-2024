package org.ethz.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to hold the names of three cities
        String[] cities = new String[3];

        System.out.print("Enter the first city: ");
        cities[0] = scanner.nextLine();
        System.out.print("Enter the second city: ");
        cities[1] = scanner.nextLine();
        System.out.print("Enter the third city: ");
        cities[2] = scanner.nextLine();

        Arrays.sort(cities);
        System.out.println("The cities in ascending order are:");
        for (String city : cities) {
            System.out.println(city);
        }
        scanner.close();
    }
}
