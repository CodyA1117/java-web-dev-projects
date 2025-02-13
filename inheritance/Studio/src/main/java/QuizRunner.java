import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        ArrayList<String> mcOptions = new ArrayList<>();
        mcOptions.add("Red");
        mcOptions.add("Blue");
        mcOptions.add("Green");
        quiz.addQuestion(new MultipleChoice("What is the color of the sky?", 5, mcOptions, "Blue"));

        ArrayList<String> cbOptions = new ArrayList<>();
        cbOptions.add("Java");
        cbOptions.add("Python");
        cbOptions.add("C++");
        ArrayList<String> cbCorrect = new ArrayList<>();
        cbCorrect.add("Java");
        cbCorrect.add("Python");
        quiz.addQuestion(new Checkbox("Which are programming languages?", 10, cbOptions, cbCorrect));

        quiz.addQuestion(new TrueFalse("The Earth is flat.", 5, false));

        quiz.runQuiz();
        quiz.gradeQuiz();
    }
}
