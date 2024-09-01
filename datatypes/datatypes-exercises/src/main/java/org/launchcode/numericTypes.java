package org.launchcode;
import java.util.Scanner;

public class numericTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the length of the rectangle
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        // Prompt the user for the width of the rectangle
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        // Calculate the area of the rectangle
        double area = length * width;

        // Print the area of the rectangle
        System.out.println("The area of the rectangle is: " + area);
    }
}
