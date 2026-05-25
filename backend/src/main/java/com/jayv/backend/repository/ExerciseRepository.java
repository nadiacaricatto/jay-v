package com.jayv.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayv.backend.model.Exercise;

public interface ExerciseRepository extends JpaRepository <Exercise, Long> 
{

}
