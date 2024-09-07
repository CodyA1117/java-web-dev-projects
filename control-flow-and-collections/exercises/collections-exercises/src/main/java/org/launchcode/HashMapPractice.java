package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        // Create a HashMap to store student IDs and names
        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        // Input loop for student names and IDs
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);

                input.nextLine();  // Consume the newline character after the integer input
            }
        } while (!newStudent.equals(""));  // Stop when the user presses Enter with no name

        input.close();  // Close the scanner

        // Print the class roster
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        // Print the number of students
        System.out.println("Number of students in roster: " + classRoster.size());
    }
}

