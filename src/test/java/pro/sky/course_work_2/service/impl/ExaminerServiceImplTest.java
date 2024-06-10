package pro.sky.course_work_2.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.course_work_2.service.QuestionService;

import static pro.sky.course_work_2.test_utils.Constants.JAVA_QUESTIONS;
import static pro.sky.course_work_2.test_utils.Constants.MATH_QUESTIONS;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    private QuestionService serviceJava;

    @Mock
    private QuestionService serviceMath;

    @InjectMocks
    private ExaminerServiceImpl service;

    @BeforeEach
    void setUp() {
        service = new ExaminerServiceImpl(serviceJava, serviceMath);
    }

    @Test
    void getQuestions() {

        Mockito.when(serviceJava.getAllQuestions()).thenReturn(JAVA_QUESTIONS);
        Mockito.when(serviceMath.getAllQuestions()).thenReturn(MATH_QUESTIONS);
        Mockito.when(serviceJava.getRandomQuestion())
                .thenReturn(JAVA_QUESTIONS.get(0))
                .thenReturn(JAVA_QUESTIONS.get(1));
        Mockito.when(serviceMath.getRandomQuestion())
                .thenReturn(MATH_QUESTIONS.get(0))
                .thenReturn(MATH_QUESTIONS.get(1));

        Assertions.assertEquals(3, service.getQuestions(3).size());
    }
}