package pro.sky.course_work_2.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.course_work_2.service.QuestionService;
import pro.sky.course_work_2.service.impl.repository.QuestionRepository;

@Service
public class MathQuestionServiceImpl extends QuestionServiceImpl implements QuestionService {

    public MathQuestionServiceImpl(@Qualifier("mathQuestionRepositoryImpl") QuestionRepository repository) {
        super(repository);
    }

}
