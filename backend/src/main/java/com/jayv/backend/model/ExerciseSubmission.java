package com.jayv.backend.model;

import java.time.LocalDateTime;

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
@Table (name = "tb_exercisesubmission")
public class ExerciseSubmission {

@Id 
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id; 

@NotNull
private LocalDateTime submittedAt;

@NotBlank
private String submittedAnswer; 

@NotNull
private Boolean isCorrect;

@Enumerated (EnumType.STRING)
private ErrorType errorType; 

@ManyToOne
@JoinColumn (name = "exercise_id")
private Exercise exercise; 

@ManyToOne
@JoinColumn (name = "studentprofile_id")
private StudentProfile studentProfile; 

public Long getId () {
    return this.id; 
}

public void setId (Long id) {
    this.id = id; 
}

public LocalDateTime getSubmittedAt () {
    return this.submittedAt;
}

public void setSubmittedAt (LocalDateTime submittedAt) {
    this.submittedAt = submittedAt; 
}

public String getSubmittedAnswer () {
    return this.submittedAnswer; 
}

public void setSubmittedAnswer (String submittedAnswer) {
    this.submittedAnswer = submittedAnswer; 
}

public Boolean getIsCorrect () {
    return this.isCorrect; 
}

public void setIsCorrect (Boolean isCorrect) {
    this.isCorrect = isCorrect;
}

public ErrorType getErrorType () {
    return this.errorType;
}

public void setErrorType (ErrorType errorType) {
    this.errorType = errorType;
}

public Exercise getExercise () {
    return this.exercise; 
}

public void setExercise (Exercise exercise) {
    this.exercise = exercise; 
}

public StudentProfile getStudentProfile (){
    return this.studentProfile; 
}

public void setStudentProfile (StudentProfile studentProfile) {
    this.studentProfile = studentProfile; 
}
}
