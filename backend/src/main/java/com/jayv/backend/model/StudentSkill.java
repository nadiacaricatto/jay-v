package com.jayv.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "tb_studentskill")
public class StudentSkill {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id;

@NotNull
@Enumerated (EnumType.STRING)
private SkillLevel skillLevel;

@NotNull
private Double scorePercentage;

@ManyToOne
@JoinColumn (name = "studentprofile_id", nullable = false)
private StudentProfile studentProfile; 

@ManyToOne 
@JoinColumn (name = "concept_id", nullable = false)
private Concept concept; 

public Long getId () {
    return this.id;
}

public void setId (Long id) {
    this.id = id;
}

public SkillLevel getSkillLevel () {
    return this.skillLevel;
}

public void setSkillLevel (SkillLevel skillLevel) {
    this.skillLevel = skillLevel; 
}

public Double getScorePercentage () {
    return this.scorePercentage;
}

public void setScorePercentage (Double scorePercentage) {
    this.scorePercentage = scorePercentage;
}

public StudentProfile getStudentProfile () {
    return this.studentProfile; 
}

public void setStudentProfile (StudentProfile studentProfile) {
    this.studentProfile = studentProfile;
}

public Concept getConcept () {
    return this.concept;
}

public void setConcept (Concept concept) {
    this.concept = concept;
}

}
