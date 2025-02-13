import java.util.ArrayList;

public class Checkbox extends Question {
    private ArrayList<String> options;
    private ArrayList<String> correctAnswers;

    public Checkbox(String questionText, int points, ArrayList<String> options, ArrayList<String> correctAnswers) {
        super(questionText, points);
        this.options = options;
        this.correctAnswers = correctAnswers;
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
        String[] userAnswers = answer.split(",");
        ArrayList<String> userSelections = new ArrayList<>();
        for (String ans : userAnswers) {
            userSelections.add(ans.trim());
        }
        return userSelections.equals(correctAnswers);
    }
}
