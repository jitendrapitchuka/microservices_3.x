package com.question.service.impl;

import com.question.entity.Question;
import com.question.repo.QuestionRepo;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepo questionRepo;
    @Override
    public Question create(Question question) {
        return questionRepo.save(question);
    }

    @Override
    public Question getOne(Long id) {
        return questionRepo.findById(id).orElseThrow(()->new RuntimeException("question not found"));
    }

    @Override
    public List<Question> get() {
        return questionRepo.findAll();
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
        return questionRepo.findByQuizId(quizId);
    }
}
