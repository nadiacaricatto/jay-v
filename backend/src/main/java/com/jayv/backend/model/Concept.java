package com.jayv.backend.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name="tb_concept")

public class Concept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String description; 

    @NotNull
    @Enumerated(EnumType.STRING)
    private DifficultyLevel difficultyLevel;

    @OneToMany (mappedBy = "concept", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties (value = "concept", allowSetters = true)
    private List <Exercise> exercises;
    


public Long getId () {
    return this.id;
}

public void setId (Long id) {
    this.id = id;
}

public String getName () {
    return this.name;
}

public void setName (String name) {
    this.name = name;
}

public String getDescription () {
    return this.description;
}

public void setDescription (String description) {
    this.description = description; 
}

public DifficultyLevel getDifficultyLevel () {
    return this.difficultyLevel;
}

public void setDifficultyLevel (DifficultyLevel difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
}

public List<Exercise> getExercises () {
    return this.exercises;
}

public void setExercises (List<Exercise> exercise) {
    this.exercises = exercise; 
}
}