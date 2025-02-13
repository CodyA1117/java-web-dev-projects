import java.util.ArrayList;

public class MultipleChoice extends Question {
    private ArrayList<String> options;
    private int correctAnswerIndex; // Use an integer for simplicity

    public MultipleChoice(String questionText, int points, ArrayList<String> options, int correctAnswerIndex) {
        super(questionText, points);
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getQuestionText());
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    @Override
    public boolean checkAnswer(String answer) {
        String normalized = normalizeInput(answer);
        try {
            int userIndex = Integer.parseInt(normalized) - 1;
            return userIndex == correctAnswerIndex;
        } catch (NumberFormatException e) {
            return false; // Invalid input
        }
    }
}
