package org.ethz.day2;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        final int MAX_SCORES = 100;
        int[] scores = new int[MAX_SCORES];
        int count = 0;
        double sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter scores (enter a negative number to stop):");

        while (count < MAX_SCORES) {
            int score = scanner.nextInt();

            if (score < 0) {
                break;
            }

            scores[count] = score;
            sum += score;
            count++;
        }

        scanner.close();

        double average = sum / count;
        int aboveOrEqual = 0;
        int below = 0;

        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }

        System.out.println("Average score: " + average);
        System.out.println("Number of scores above or equal to the average: " + aboveOrEqual);
        System.out.println("Number of scores below the average: " + below);
    }
}
