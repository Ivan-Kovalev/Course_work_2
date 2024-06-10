package pro.sky.course_work_2.service;

import pro.sky.course_work_2.model.Question;

import java.util.Collection;
import java.util.Random;

public interface QuestionService {
    Random RANDOM = new Random();
    Question add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAllQuestions();

    Question getRandomQuestion();

}
