package com.jayv.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "tb_exercise")

public class Exercise {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private DifficultyLevel difficultyLevel;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Type type;

    @NotBlank
    private String description;

    @Column (nullable = true)
    private String codeTemplate;

    @NotBlank
    private String solutionReference;

    @ManyToOne 
    @JoinColumn (name = "concept_id", nullable = false)
    private Concept concept; 

public Long getId () {
    return this.id;
}

public void setId (Long id) {
    this.id = id;
}

public DifficultyLevel getDifficultyLevel () {
return this.difficultyLevel;
}

public void setDifficultyLevel (DifficultyLevel difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
}

public Type getType () {
    return this.type; 
}

public void setType (Type type) {
    this.type = type;
}

public String getDescription () {
    return this.description; 
}

public void setDescription (String description) {
    this.description = description; 
}

public String getCodeTemplate () {
    return this.codeTemplate;
}

public void setCodeTemplate (String codeTemplate) {
    this.codeTemplate = codeTemplate; 
}

public String getSolutionReference () {
    return this.solutionReference; 
}

public void setSolutionReference (String solutionReference) {
    this.solutionReference = solutionReference;
}

public Concept getConcept () {
    return this.concept;
}

public void setConcept (Concept concept) {
    this.concept = concept; 
}

}

