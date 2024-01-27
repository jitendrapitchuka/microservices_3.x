package com.question.service;

import com.question.entity.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);

    Question getOne(Long id);

    List<Question> get();

    List<Question> getQuestionsOfQuiz(Long quizId);
}
