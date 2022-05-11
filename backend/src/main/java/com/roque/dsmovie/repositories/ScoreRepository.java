package com.roque.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roque.dsmovie.entities.Score;
import com.roque.dsmovie.entities.ScorePK;



public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}