package pro.sky.course_work_2.service.impl.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.course_work_2.exception.QuestionException;
import pro.sky.course_work_2.model.Question;
import pro.sky.course_work_2.repository.impl.JavaQuestionRepositoryImpl;
import pro.sky.course_work_2.repository.QuestionRepository;
import pro.sky.course_work_2.test_utils.Constants;

class JavaQuestionRepositoryImplTest {
    private final QuestionRepository repository = new JavaQuestionRepositoryImpl();

    @Test
    void add() {
        Assertions.assertEquals(repository.add("Вопрос", "Ответ"), new Question("Вопрос", "Ответ"));
        Assertions.assertEquals(1, repository.getAllQuestions().size());
        Assertions.assertFalse(repository.getAllQuestions().isEmpty());

        repository.add("Вопрос", "Ответ");
        repository.add("Вопрос", "Ответ");
        repository.add("Вопрос", "Ответ");
        Assertions.assertEquals(1, repository.getAllQuestions().size());
    }

    @Test
    void addObject() {
        Assertions.assertEquals(repository.add(Constants.DEFAULT_QUESTION), new Question("Вопрос", "Ответ"));
        Assertions.assertEquals(1, repository.getAllQuestions().size());
        Assertions.assertFalse(repository.getAllQuestions().isEmpty());

        repository.add(Constants.DEFAULT_QUESTION);
        repository.add(Constants.DEFAULT_QUESTION);
        repository.add(Constants.DEFAULT_QUESTION);
        Assertions.assertEquals(1, repository.getAllQuestions().size());
    }

    @Test
    void remove() {
        repository.add(Constants.DEFAULT_QUESTION);
        Assertions.assertEquals(1, repository.getAllQuestions().size());
        repository.remove(Constants.DEFAULT_QUESTION);
        Assertions.assertTrue(repository.getAllQuestions().isEmpty());
    }

    @Test
    void removeThrow() {
        Assertions.assertThrows(QuestionException.class, () -> repository.remove(Constants.DEFAULT_QUESTION));
    }

    @Test
    void getAllQuestions() {
        repository.add(Constants.DEFAULT_QUESTION);
        Assertions.assertEquals(1, repository.getAllQuestions().size());
        Assertions.assertFalse(repository.getAllQuestions().isEmpty());
    }
}
