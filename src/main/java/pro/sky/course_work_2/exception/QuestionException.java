package pro.sky.course_work_2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionException extends RuntimeException {
    public QuestionException(String message) {
        super(message);
    }
}