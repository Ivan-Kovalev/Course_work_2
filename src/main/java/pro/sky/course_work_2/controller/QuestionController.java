package pro.sky.course_work_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course_work_2.model.Question;
import pro.sky.course_work_2.service.QuestionService;

import java.util.Collection;

@RestController
public abstract class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(path = "/add")
    public Question add(@RequestParam String question,
                        @RequestParam String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping(path = "/remove")
    public Question remove(@RequestParam("question") String question,
                           @RequestParam("answer") String answer) {
        Question questionDeleted = new Question(question, answer);
        return questionService.remove(questionDeleted);
    }

    @GetMapping
    public Collection<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }
}
