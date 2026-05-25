package com.jayv.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayv.backend.model.ExerciseSubmission;

public interface ExerciseSubmissionRepository extends JpaRepository <ExerciseSubmission, Long>{

}
