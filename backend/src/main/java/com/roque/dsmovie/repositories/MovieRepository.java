package com.roque.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roque.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	

}
