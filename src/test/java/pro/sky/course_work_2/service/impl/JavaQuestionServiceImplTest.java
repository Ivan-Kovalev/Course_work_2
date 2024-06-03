package pro.sky.course_work_2.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.course_work_2.service.impl.repository.JavaQuestionRepositoryImpl;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceImplTest {

    @Mock
    private JavaQuestionRepositoryImpl repository;

    @InjectMocks
    private JavaQuestionServiceImpl service;

    @Test
    void add() {
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