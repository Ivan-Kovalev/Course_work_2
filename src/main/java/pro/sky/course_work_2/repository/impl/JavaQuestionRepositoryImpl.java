package pro.sky.course_work_2.repository.impl;

import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public class JavaQuestionRepositoryImpl extends QuestionRepositoryImpl {

    public JavaQuestionRepositoryImpl() {
        super(new HashSet<>());
    }
}
