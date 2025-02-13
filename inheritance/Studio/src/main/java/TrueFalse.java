public class TrueFalse extends Question {
    private boolean correctAnswer;

    public TrueFalse(String questionText, int points, boolean correctAnswer) {
        super(questionText, points);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getQuestionText());
        System.out.println("1. True");
        System.out.println("2. False");
    }

    @Override
    public boolean checkAnswer(String answer) {
        String normalized = normalizeInput(answer);
        return (normalized.equals("1") && correctAnswer) ||
                (normalized.equals("2") && !correctAnswer);
    }
}
