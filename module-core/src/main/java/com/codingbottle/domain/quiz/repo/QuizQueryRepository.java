package com.codingbottle.domain.quiz.repo;

import com.codingbottle.auth.entity.User;
import com.codingbottle.domain.quiz.entity.QQuiz;
import com.codingbottle.domain.quiz.entity.QUserQuiz;
import com.codingbottle.domain.quiz.entity.Quiz;
import com.codingbottle.domain.quiz.entity.QuizStatus;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class QuizQueryRepository {
    private final JPAQueryFactory jpaQueryFactory;
    private final QQuiz qQuiz = QQuiz.quiz;
    private final QUserQuiz qUserQuiz = QUserQuiz.userQuiz;

    public List<Quiz> findRandomQuizzes(User user, int limit) {
        return jpaQueryFactory.selectFrom(qQuiz)
                .leftJoin(qUserQuiz)
                .on(qQuiz.eq(qUserQuiz.quiz), qUserQuiz.user.eq(user), qUserQuiz.quizStatus.eq(QuizStatus.CORRECT))
                .where(qUserQuiz.id.isNull())
                .orderBy(Expressions.numberTemplate(Double.class, "function('rand')").asc())
                .limit(limit)
                .fetch();
    }
}
