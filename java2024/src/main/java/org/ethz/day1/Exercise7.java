package org.ethz.day1;

import java.util.Scanner;

public class Exercise7 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of the package between 0 and 10: ");
        double weight = input.nextDouble(); 

        if (weight > 0 && weight <= 3) {
            System.out.println("Shipping cost: 1.5");
        } else if (weight > 3 && weight <= 5) {
            System.out.println("Shipping cost: 2.5");
        } else if (weight > 5 && weight <= 10) {
            System.out.println("Shipping cost: 4.2");
        } else {
            System.out.println("Weight out of bounds. Please enter a weight between 0 and 10.");
        }
        input.close();
    }
}


