package org.ethz.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise3 {

    // HashMaps to store the rankings of boys' and girls' names
    private static HashMap<String, Integer> boyNames = new HashMap<>();
    private static HashMap<String, Integer> girlNames = new HashMap<>();

    public static void main(String[] args) {
        // Prompt the user to enter the file path
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the path to the baby names ranking file: ");
        String filePath = inputScanner.nextLine();

        // Load the baby names data from the file
        loadBabyNames(filePath);

        // Enter inquiry loop
        String continueInquiry;
        do {
            // Get input from the user for gender and name
            System.out.print("Enter gender (boy/girl): ");
            String gender = inputScanner.nextLine().trim();

            System.out.print("Enter the name: ");
            String name = inputScanner.nextLine().trim();

            // Display the ranking for the name based on the gender
            if (gender.equals("boy")) {
                displayRanking(boyNames, name);
            } else if (gender.equals("girl")) {
                displayRanking(girlNames, name);
            } else {
                System.out.println("Invalid gender. Please enter 'boy' or 'girl'.");
            }

            // Ask if the user wants to continue
            System.out.print("Would you like to enter another inquiry? (yes/no): ");
            continueInquiry = inputScanner.nextLine().trim();

        } while (continueInquiry.equals("yes"));

        inputScanner.close();
    }

    // Method to load baby names from the file
    private static void loadBabyNames(String filePath) {
        try {
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);

            // Reading each line in the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split("\\s+");  // Splitting based on whitespace

                // Assuming each line has: rank boy_name boy_number girl_name girl_number
                int rank = Integer.parseInt(data[0]);
                String boyName = data[1];
                String girlName = data[3];  // Since girl_name comes after boy_number

                // Store boy and girl names with their rankings in HashMaps
                boyNames.put(boyName, rank);
                girlNames.put(girlName, rank);
            }

            fileScanner.close();
            System.out.println("Baby names data loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file path.");
        }
    }

    // Method to display ranking for a given name
    private static void displayRanking(HashMap<String, Integer> namesMap, String name) {
        if (namesMap.containsKey(name)) {
            int rank = namesMap.get(name);
            System.out.println("The name '" + name + "' is ranked #" + rank);
        } else {
            System.out.println("The name '" + name + "' is not ranked.");
        }
    }
}
