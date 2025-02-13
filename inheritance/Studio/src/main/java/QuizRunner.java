import java.util.ArrayList;
import java.util.HashSet;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Multiple Choice
        ArrayList<String> mcOptions = new ArrayList<>();
        mcOptions.add("Red");
        mcOptions.add("Blue");
        mcOptions.add("Green");
        quiz.addQuestion(new MultipleChoice("What is the color of the sky?", 5, mcOptions, 1)); // Correct: "Blue" (index 1)

        // Checkbox
        ArrayList<String> cbOptions = new ArrayList<>();
        cbOptions.add("Java");
        cbOptions.add("Python");
        cbOptions.add("C++");
        HashSet<Integer> cbCorrect = new HashSet<>();
        cbCorrect.add(0); // Java
        cbCorrect.add(1); // Python
        quiz.addQuestion(new Checkbox("Which are programming languages?", 10, cbOptions, cbCorrect));

        // True/False
        quiz.addQuestion(new TrueFalse("The Earth is flat.", 5, false)); // Correct: false

        // Run the quiz
        quiz.runQuiz();
        quiz.gradeQuiz();
    }
}
