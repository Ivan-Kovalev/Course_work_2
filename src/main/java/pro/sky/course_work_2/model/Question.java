package pro.sky.course_work_2.model;

import java.util.Objects;

public class Question {
    private final String textQuestion;
    private final String textAnswer;

    public Question(String textQuestion, String textAnswer) {
        this.textQuestion = textQuestion;
        this.textAnswer = textAnswer;
    }

    public String getTextQuestion() {
        return textQuestion;
    }

    public String getTextAnswer() {
        return textAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return Objects.equals(textQuestion, question1.textQuestion) && Objects.equals(textAnswer, question1.textAnswer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textQuestion, textAnswer);
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + textQuestion + '\'' +
                ", answer='" + textAnswer + '\'' +
                '}';
    }
}
