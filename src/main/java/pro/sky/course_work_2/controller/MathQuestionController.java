package pro.sky.course_work_2.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course_work_2.model.Question;
import pro.sky.course_work_2.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping(path = "/exam/math")
public class MathQuestionController {

    private final QuestionService service;

    public MathQuestionController(@Qualifier("mathQuestionServiceImpl") QuestionService service) {
        this.service = service;
    }

    @GetMapping(path = "/add")
    public Question add(@RequestParam("question") String question,
                        @RequestParam("answer") String answer) {
        return service.add(question, answer);
    }

    @GetMapping(path = "/remove")
    public Question remove(@RequestParam("question") String question,
                           @RequestParam("answer") String answer) {
        Question questionDeleted = new Question(question, answer);
        return service.remove(questionDeleted);
    }

    @GetMapping
    public Collection<Question> getAllQuestions() {
        return service.getAllQuestions();
    }
}
