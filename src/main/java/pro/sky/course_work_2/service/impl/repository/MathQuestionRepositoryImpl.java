package pro.sky.course_work_2.service.impl.repository;

import org.springframework.stereotype.Repository;
import pro.sky.course_work_2.exception.QuestionException;
import pro.sky.course_work_2.model.Question;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Repository
public class MathQuestionRepositoryImpl implements QuestionRepository {

    private final Set<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        return add(new Question(question, answer));
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (questions.remove(question)) {
            return question;
        } else {
            throw new QuestionException("Такой вопрос не найден");
        }
    }

    @Override
    public Collection<Question> getAllQuestions() {
        return Collections.unmodifiableCollection(questions);
    }
}
