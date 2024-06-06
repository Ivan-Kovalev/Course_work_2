package pro.sky.course_work_2.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.course_work_2.exception.QuestionException;
import pro.sky.course_work_2.model.Question;
import pro.sky.course_work_2.service.ExaminerService;
import pro.sky.course_work_2.service.QuestionService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService serviceJava;
    private final QuestionService serviceMath;

    public ExaminerServiceImpl(@Qualifier("javaQuestionServiceImpl") QuestionService serviceJava,
                               @Qualifier("mathQuestionServiceImpl") QuestionService serviceMath) {
        this.serviceJava = serviceJava;
        this.serviceMath = serviceMath;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> questions = new HashSet<>();

        if (amount > getCountQuestions()) {
            throw new QuestionException("Нет столько вопросов");
        }

        while (questions.size() < amount) {
            questions.add(serviceJava.getRandomQuestion());
            if (questions.size() < amount) {
                questions.add(serviceMath.getRandomQuestion());
            }
        }
        return questions;
    }

    private int getCountQuestions() {
        return serviceJava.getAllQuestions().size() + serviceMath.getAllQuestions().size();
    }

}
