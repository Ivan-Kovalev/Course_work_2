package pro.sky.course_work_2.service.impl.repository;

import org.jetbrains.annotations.NotNull;
import pro.sky.course_work_2.model.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question add(String question, String answer);

    Question add(@NotNull Question question);

    Question remove(@NotNull Question question);

    Collection<Question> getAllQuestions();
}
