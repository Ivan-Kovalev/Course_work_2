package pro.sky.course_work_2.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.course_work_2.model.Question;
import pro.sky.course_work_2.repository.QuestionRepository;

import static pro.sky.course_work_2.test_utils.Constants.DEFAULT_QUESTION;
import static pro.sky.course_work_2.test_utils.Constants.JAVA_QUESTIONS;

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
        Mockito.when(repository.add(DEFAULT_QUESTION)).thenReturn(DEFAULT_QUESTION);

        Assertions.assertEquals(DEFAULT_QUESTION, service.add(DEFAULT_QUESTION));
    }

    @Test
    void testAdd() {
        Mockito.when(repository.add("Вопрос", "Ответ")).thenReturn(new Question("Вопрос", "Ответ"));

        Assertions.assertEquals(new Question("Вопрос", "Ответ"), service.add("Вопрос", "Ответ"));
    }

    @Test
    void remove() {
        Mockito.when(repository.remove(JAVA_QUESTIONS.get(0))).thenReturn(new Question("Джава1", "Отв1"));

        Assertions.assertEquals(new Question("Джава1", "Отв1"), service.remove(JAVA_QUESTIONS.get(0)));
    }

    @Test
    void getAllQuestions() {
        Mockito.when(repository.getAllQuestions()).thenReturn(JAVA_QUESTIONS);

        Assertions.assertEquals(5, service.getAllQuestions().size());
    }

    @Test
    void getRandomQuestion() {
        Mockito.when(repository.getAllQuestions()).thenReturn(JAVA_QUESTIONS);

        Assertions.assertTrue(service.getAllQuestions().contains(service.getRandomQuestion()));
    }
}