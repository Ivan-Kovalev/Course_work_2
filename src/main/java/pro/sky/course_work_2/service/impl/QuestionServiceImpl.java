package pro.sky.course_work_2.service.impl;

import pro.sky.course_work_2.model.Question;
import pro.sky.course_work_2.repository.QuestionRepository;
import pro.sky.course_work_2.service.QuestionService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository repository;

    public QuestionServiceImpl(QuestionRepository repository) {
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
        return collect.get(QuestionService.RANDOM.nextInt(repository.getAllQuestions().size()));
    }
}
