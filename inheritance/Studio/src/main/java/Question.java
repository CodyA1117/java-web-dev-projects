public abstract class Question {
    private String questionText;
    private int points;

    public Question(String questionText, int points) {
        this.questionText = questionText;
        this.points = points;
    }

    public String getQuestionText() {
        return questionText;
    }

    public int getPoints() {
        return points;
    }

    // Normalize user input: lowercased and trimmed
    protected String normalizeInput(String input) {
        return input.trim().toLowerCase();
    }

    public abstract void displayQuestion();
    public abstract boolean checkAnswer(String answer);
}
