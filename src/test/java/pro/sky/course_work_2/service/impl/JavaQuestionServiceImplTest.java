package pro.sky.course_work_2.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Qualifier;
import pro.sky.course_work_2.model.Question;
import pro.sky.course_work_2.service.QuestionService;
import pro.sky.course_work_2.service.impl.repository.JavaQuestionRepositoryImpl;
import pro.sky.course_work_2.service.impl.repository.QuestionRepository;
import pro.sky.course_work_2.test_utils.Constants;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceImplTest {

    @Mock
    private QuestionRepository repository;

    @InjectMocks
    private JavaQuestionServiceImpl service;

    @BeforeEach
    void setUp() {
        service = new JavaQuestionServiceImpl(repository);
    }

    @Test
    void add() {
        Assertions.assertEquals(new Question("ДжаваТест", "Тест"), service.add("ДжаваТест", "Тест"));
    }

    @Test
    void testAdd() {
    }

    @Test
    void remove() {
    }

    @Test
    void getAllQuestions() {
    }

    @Test
    void getRandomQuestion() {
    }
}