package pro.sky.course_work_2.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.course_work_2.repository.QuestionRepository;

@Service
public class JavaQuestionServiceImpl extends QuestionServiceImpl {

    public JavaQuestionServiceImpl(@Qualifier("javaQuestionRepositoryImpl") QuestionRepository repository) {
        super(repository);
    }

}
