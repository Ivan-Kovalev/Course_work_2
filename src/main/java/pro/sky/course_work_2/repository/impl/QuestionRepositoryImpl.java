package pro.sky.course_work_2.repository.impl;

import pro.sky.course_work_2.exception.QuestionException;
import pro.sky.course_work_2.model.Question;
import pro.sky.course_work_2.repository.QuestionRepository;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class QuestionRepositoryImpl implements QuestionRepository {
    private final Set<Question> questions;

    public QuestionRepositoryImpl(Set<Question> questions) {
        this.questions = questions;
    }

    public Question add(String question, String answer) {
        return add(new Question(question, answer));
    }

    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    public Question remove(Question question) {
        if (questions.remove(question)) {
            return question;
        } else {
            throw new QuestionException("Такой вопрос не найден");
        }
    }

    public Collection<Question> getAllQuestions() {
        return Collections.unmodifiableCollection(questions);
    }
}
