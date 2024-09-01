package org.launchcode;
import java.util.Scanner;

public class AliceAdventures {
    public static void main(String[] args) {
        // Define the initial sentence
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a search term
        System.out.println("Enter a term to search for:");
        String searchTerm = scanner.nextLine();

        // Convert both the sentence and searchTerm to lowercase to make the search case-insensitive
        String lowerCaseSentence = sentence.toLowerCase();
        String lowerCaseSearchTerm = searchTerm.toLowerCase();

        // Check if the search term exists in the sentence
        boolean found = lowerCaseSentence.contains(lowerCaseSearchTerm);
        System.out.println("Search term found: " + found);

        if (found) {
            // Find the index of the search term in the original sentence
            Integer index = lowerCaseSentence.indexOf(lowerCaseSearchTerm);
            // Get the length of the search term
            Integer length = searchTerm.length();

            // Print out the index and length of the search term
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");

            // Replace the search term with an empty string to remove it from the sentence
            String modifiedSentence = sentence.replaceFirst("(?i)" + searchTerm, "");  // (?i) makes the replacement case-insensitive

            // Print the modified sentence
            System.out.println(modifiedSentence);
        } else {
            System.out.println("The term '" + searchTerm + "' was not found in the sentence.");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
