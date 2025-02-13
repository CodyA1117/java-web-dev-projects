public abstract class Question {
    private String questionText;
    private int points;
    private String userAnswer;

    public Question(String questionText, int points) {
        this.questionText = questionText;
        this.points = points;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public int getPoints() {
        return points;
    }

    public abstract void displayQuestion();
    public abstract boolean checkAnswer(String answer);
}

