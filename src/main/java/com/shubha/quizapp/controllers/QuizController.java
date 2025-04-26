package com.shubha.quizapp.controllers;

import com.shubha.quizapp.entities.Quiz;
import com.shubha.quizapp.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping
    public List<Quiz> getAllQuiz(){
        return quizService.findAll();
    }

    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz quiz){
        return quizService.createQuiz(quiz);
    }

    @GetMapping("/{id}")
    public Quiz getQuizById(@PathVariable Long id){
        return quizService.getById(id);
    }
}
