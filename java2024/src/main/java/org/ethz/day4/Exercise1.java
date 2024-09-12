package org.ethz.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise1 {

    public static void main(String[] args) {
        // Create a Set to store vowels (both upper and lower case)
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        // Variables to store the count of vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Prompt user for the file name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text file name (with extension): ");
        String fileName = scanner.nextLine();

        // Open and read the file using Scanner
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            // Process the file character by character
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                for (char ch : line.toCharArray()) {
                    // Check if the character is a letter
                    if (Character.isLetter(ch)) {
                        if (vowels.contains(ch)) {
                            vowelCount++;
                        } else {
                            consonantCount++;
                        }
                    }
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return;
        }

        // Display the counts
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
