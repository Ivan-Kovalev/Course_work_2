package pro.sky.course_work_2.service;

import pro.sky.course_work_2.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
