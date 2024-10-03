package org.launchcode;

import java.net.StandardSocketOptions;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for(String student : studentFiles.keySet()){
            int points = CheckFileExtension(studentFiles.get(student));
            System.out.println(student + " received " + points + " points.");
        }
    }

    public static void Divide(int x, int y)
    {
        try {
            int result = x/ y;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

    }

    public static int CheckFileExtension(String fileName)
    {
        try {
            if(fileName == null || fileName.isEmpty()) {
                throw new IllegalArgumentException("FIle name cannot be null or empty");
            }
            if (fileName.endsWith(".java")) {
                return 1;
            } else{
                return 0;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}