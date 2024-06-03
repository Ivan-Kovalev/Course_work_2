package pro.sky.course_work_2.test_utils;

import pro.sky.course_work_2.model.Question;
import java.util.Set;

public class Constants {
    private Constants() {
    }

    public static Question DEFAULT_QUESTION = new Question("Вопрос", "Ответ");

    public static Set<Question> JAVA_QUESTIONS = Set.of(
            new Question("Вопр1", "Отв1"),
            new Question("Вопр2", "Отв2"),
            new Question("Вопр3", "Отв3"),
            new Question("Вопр4", "Отв4"),
            new Question("Вопр5", "Отв5"));

    public static Set<Question> MATH_QUESTIONS = Set.of(
            new Question("Вопр1", "Отв1"),
            new Question("Вопр2", "Отв2"),
            new Question("Вопр3", "Отв3"),
            new Question("Вопр4", "Отв4"),
            new Question("Вопр5", "Отв5"));
}
