package com.jayv.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayv.backend.model.Concept;

public interface ConceptRepository extends JpaRepository <Concept, Long> {

}
