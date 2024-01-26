package com.quiz.services.impl;

import com.quiz.entity.Quiz;
import com.quiz.repo.QuizRepo;
import com.quiz.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuizServiceImpl implements QuizService {
    @Autowired
    private QuizRepo quizRepo;
    @Override
    public Quiz add(Quiz quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return quizRepo.findAll();
    }

    @Override
    public Quiz get(Long id) {
        return quizRepo.findById(id).orElseThrow(()->new RuntimeException("quiz not found"));
    }
}
