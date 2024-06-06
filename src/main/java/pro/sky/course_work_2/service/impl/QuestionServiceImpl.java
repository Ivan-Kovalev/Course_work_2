package pro.sky.course_work_2.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import pro.sky.course_work_2.model.Question;
import pro.sky.course_work_2.service.QuestionService;
import pro.sky.course_work_2.service.impl.repository.QuestionRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class QuestionServiceImpl {
    @Qualifier("javaQuestionRepositoryImpl")
    protected final QuestionRepository repository;

    public QuestionServiceImpl(@Qualifier("javaQuestionRepositoryImpl") QuestionRepository repository) {
        this.repository = repository;
    }

    public Question add(String question, String answer) {
        return repository.add(question, answer);
    }

    public Question add(Question question) {
        return repository.add(question);
    }

    public Question remove(Question question) {
        return repository.remove(question);
    }

    public Collection<Question> getAllQuestions() {
        return repository.getAllQuestions();
    }

    public Question getRandomQuestion() {
        List<Question> collect = new ArrayList<>(repository.getAllQuestions());
        return collect.get(QuestionService.RANDOM.nextInt(repository.getAllQuestions().size()));
    }
}
