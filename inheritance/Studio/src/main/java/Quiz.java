import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;
    private int totalScore;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.totalScore = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            question.displayQuestion();
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            question.setUserAnswer(userAnswer);
            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                totalScore += question.getPoints();
            } else {
                System.out.println("Incorrect.");
            }
        }
    }

    public void gradeQuiz() {
        System.out.println("Quiz Complete!");
        System.out.println("Your total score: " + totalScore);
    }
}
