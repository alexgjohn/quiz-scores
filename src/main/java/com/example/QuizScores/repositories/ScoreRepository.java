package com.example.QuizScores.repositories;

import com.example.QuizScores.models.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository <Score, Long>{
}
