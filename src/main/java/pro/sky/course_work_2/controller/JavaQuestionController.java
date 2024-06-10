package pro.sky.course_work_2.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course_work_2.service.QuestionService;

@RestController
@RequestMapping(path = "/exam/java")
public class JavaQuestionController extends QuestionController {

    public JavaQuestionController(@Qualifier("javaQuestionServiceImpl") QuestionService questionService) {
        super(questionService);
    }

}
