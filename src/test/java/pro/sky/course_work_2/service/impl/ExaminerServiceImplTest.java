package pro.sky.course_work_2.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.course_work_2.service.impl.repository.JavaQuestionRepositoryImpl;
import pro.sky.course_work_2.service.impl.repository.MathQuestionRepositoryImpl;
import pro.sky.course_work_2.test_utils.Constants;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    private JavaQuestionRepositoryImpl javaQuestionRepository;

    @Mock
    private MathQuestionRepositoryImpl mathQuestionRepository;

    @InjectMocks
    private ExaminerServiceImpl service;

    @BeforeEach
    void setUp() {
        Mockito.when(javaQuestionRepository.getAllQuestions()).thenReturn(Constants.JAVA_QUESTIONS);
        Mockito.when(mathQuestionRepository.getAllQuestions()).thenReturn(Constants.MATH_QUESTIONS);
    }

    @Test
    void getQuestions() {
        service.getQuestions(3); 
    }
}