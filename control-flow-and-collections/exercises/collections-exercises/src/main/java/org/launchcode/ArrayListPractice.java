import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12, 7, 9, 14, 6, 3, 8, 1, 4, 10));
        System.out.println("Sum of even numbers: " + sumEven(numbers));  // Renamed to match the method name

        // Part 2: Prompt the user for word length
        ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "orange", "grape", "melon", "peach", "kiwi", "berry", "plum"));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int wordLength = input.nextInt();
        printWordsOfLength(words, wordLength);
    }

    // Sum even numbers from ArrayList
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    // Print words with the specified length from ArrayList
    public static void printWordsOfLength(ArrayList<String> words, int length) {
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}

