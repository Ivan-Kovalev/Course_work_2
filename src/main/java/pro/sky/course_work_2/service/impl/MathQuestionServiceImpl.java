package pro.sky.course_work_2.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.course_work_2.model.Question;
import pro.sky.course_work_2.service.QuestionService;
import pro.sky.course_work_2.service.impl.repository.QuestionRepository;

import java.util.*;

@Service
public class MathQuestionServiceImpl implements QuestionService {

    @Qualifier("mathQuestionRepositoryImpl")
    private final QuestionRepository repository;

    public MathQuestionServiceImpl(@Qualifier("mathQuestionRepositoryImpl") QuestionRepository repository) {
        this.repository = repository;
    }

    @Override
    public Question add(String question, String answer) {
        return repository.add(question, answer);
    }

    @Override
    public Question add(Question question) {
        return repository.add(question);
    }

    @Override
    public Question remove(Question question) {
        return repository.remove(question);
    }

    @Override
    public Collection<Question> getAllQuestions() {
        return repository.getAllQuestions();
    }

    @Override
    public Question getRandomQuestion() {
        List<Question> collect = new ArrayList<>(repository.getAllQuestions());
        return collect.get(new Random().nextInt(repository.getAllQuestions().size()));
    }
}
