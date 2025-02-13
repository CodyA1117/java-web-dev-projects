import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Checkbox extends Question {
    private ArrayList<String> options;
    private Set<Integer> correctAnswerIndexes;

    public Checkbox(String questionText, int points, ArrayList<String> options, Set<Integer> correctAnswerIndexes) {
        super(questionText, points);
        this.options = options;
        this.correctAnswerIndexes = correctAnswerIndexes;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getQuestionText());
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.println("Enter all correct answers separated by spaces (e.g., '1 2').");
    }

    @Override
    public boolean checkAnswer(String answer) {
        String[] normalized = normalizeInput(answer).split("\\s+");
        Set<Integer> userIndexes = new HashSet<>();

        try {
            for (String ans : normalized) {
                userIndexes.add(Integer.parseInt(ans) - 1);
            }
        } catch (NumberFormatException e) {
            return false; // Invalid input
        }

        return userIndexes.equals(correctAnswerIndexes); // Check if sets match
    }
}
