package pro.sky.course_work_2.service.impl.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Repository;
import pro.sky.course_work_2.exception.QuestionException;
import pro.sky.course_work_2.model.Question;

import java.util.*;

@Repository
public class JavaQuestionRepositoryImpl implements QuestionRepository {

    private final Set<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        Question addedQuestion = new Question(question, answer);
        questions.add(addedQuestion);
        return addedQuestion;
    }

    @Override
    public Question add(@NotNull Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(@NotNull Question question) {
        Question questionReturned = new Question(question.getQuestion(), question.getAnswer());
        boolean deleted = false;
        Iterator<Question> iterator = questions.iterator();

        while (iterator.hasNext()) {
            Question question1 = iterator.next();

            if (question1.equals(question)) {
                iterator.remove();
                deleted = true;
                break;
            }
        }
        if (!deleted) {
            throw new QuestionException("Такой вопрос не найден");
        }
        return questionReturned;
    }

    @Override
    public Collection<Question> getAllQuestions() {
        return Collections.unmodifiableCollection(questions);
    }
}
