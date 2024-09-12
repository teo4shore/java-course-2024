package org.ethz.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    
    // Method to sort the ArrayList of integers using Selection Sort
    public static void sort(ArrayList<Integer> list) {
        int n = list.size();

        // Selection Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }

    // Method to read integers from a text file
    public static ArrayList<Integer> readIntegersFromFile(String fileName) {
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            // Read integers from the file, assuming they are whitespace-separated
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
        return numbers;
    }

    public static void main(String[] args) {
        // Prompt user to enter the file path
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the path to the text file containing integers: ");
        String fileName = inputScanner.nextLine();

        // Read integers from the file
        ArrayList<Integer> list = readIntegersFromFile(fileName);

        // Sort the list using the custom sort method
        sort(list);

        // Output the sorted list
        System.out.println("Sorted list: " + list);
    }
}



