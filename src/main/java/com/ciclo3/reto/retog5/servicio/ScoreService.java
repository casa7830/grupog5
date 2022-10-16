package com.ciclo3.reto.retog5.servicio;

import com.ciclo3.reto.retog5.entidad.Score;
import com.ciclo3.reto.retog5.repositorio.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository repository;

    /**
     * mostrar datos score
     *
     */
    public List<Score> getScores(){
        return repository.findAll();
    }
    /**
     *
     * guardar datos score
     */
    public Score saveScore(Score score) {

        return repository.save(score);
    }

}








