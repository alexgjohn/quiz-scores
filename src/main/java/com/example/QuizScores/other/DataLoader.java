package com.example.QuizScores.other;

import com.example.QuizScores.models.Score;
import com.example.QuizScores.repositories.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ScoreRepository scoreRepository;



    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        scoreRepository.deleteAll();

        Score score1 = new Score("alexj", 8);
        scoreRepository.save(score1);

        Score score2 = new Score("harrye", 4);
        scoreRepository.save(score2);

        Score score3 = new Score("hayleyk", 9);
        scoreRepository.save(score3);

    }
}
