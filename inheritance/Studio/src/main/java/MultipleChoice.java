import java.util.ArrayList;

public class MultipleChoice extends Question {
    private ArrayList<String> options;
    private String correctAnswer;

    public MultipleChoice(String questionText, int points, ArrayList<String> options, String correctAnswer) {
        super(questionText, points);
        this.options = options;
        this.correctAnswer = correctAnswer;
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
        return answer.equalsIgnoreCase(correctAnswer);
    }
}
