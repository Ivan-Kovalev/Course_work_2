package pro.sky.course_work_2.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.course_work_2.exception.MethodNotAllowedException;
import pro.sky.course_work_2.model.Question;
import pro.sky.course_work_2.repository.QuestionRepository;

import java.util.Collection;

@Service
public class MathQuestionServiceImpl extends QuestionServiceImpl {

    public MathQuestionServiceImpl(QuestionRepository repository) {
        super(repository);
    }

    @Override
    public Question add(String question, String answer) {
        throw new MethodNotAllowedException("Метод отсутствует");
    }

    @Override
    public Question add(Question question) {
        throw new MethodNotAllowedException("Метод отсутствует");
    }

    @Override
    public Question remove(Question question) {
        throw new MethodNotAllowedException("Метод отсутствует");
    }

    @Override
    public Collection<Question> getAllQuestions() {
        throw new MethodNotAllowedException("Метод отсутствует");
    }

    @Override
    public Question getRandomQuestion() {
        int a = RANDOM.nextInt(100);
        int b = RANDOM.nextInt(1, 100);

        int operation = RANDOM.nextInt(4);

        return switch (operation) {
            case 0 -> new Question("a + b = ", "" + (a + b));
            case 1 -> new Question("a - b = ", "" + (a - b));
            case 2 -> new Question("a * b = ", "" + (a * b));
            case 3 -> new Question("a / b = ", "" + (a / b));
            default -> throw new IllegalStateException();
        };
    }

}
