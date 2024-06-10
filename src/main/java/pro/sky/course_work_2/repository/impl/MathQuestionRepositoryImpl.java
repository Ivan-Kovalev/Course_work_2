package pro.sky.course_work_2.repository.impl;

import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public class MathQuestionRepositoryImpl extends QuestionRepositoryImpl {

    public MathQuestionRepositoryImpl() {
        super(new HashSet<>());
    }
}
