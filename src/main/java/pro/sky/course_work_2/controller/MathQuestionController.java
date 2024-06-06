package pro.sky.course_work_2.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course_work_2.service.QuestionService;

@RestController
@RequestMapping(path = "/exam/math")
public class MathQuestionController extends QuestionController {

    public MathQuestionController(@Qualifier("mathQuestionServiceImpl") QuestionService questionService) {
        super(questionService);
    }

}
