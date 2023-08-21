package com.example.QuizScores.controllers;

import com.example.QuizScores.models.Score;
import com.example.QuizScores.repositories.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ScoreController {

    @Autowired
    ScoreRepository scoreRepository;

    @GetMapping(value = "/scores")
    public ResponseEntity<List<Score>> getAllScores(){
        return new ResponseEntity<>(scoreRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/scores/{id}")
    public ResponseEntity<Optional<Score>> getScore(@PathVariable Long id){
        return new ResponseEntity<>(scoreRepository.findById(id), HttpStatus.FOUND);
    }
}
