package org.ethz.day1;

import java.util.Scanner;

public class Exercise4 {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input the radius of the circle: ");
            double radius = input.nextDouble();
            
            final double PI = 3.14159;
            double circum = radius*PI*2;
            System.out.println("The circumference is: " + circum);
        }
    }
}



