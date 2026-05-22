package com.jayv.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "tb_studentachievement")

public class StudentAchievement {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id;

@ManyToOne
@JoinColumn (name = "studentprofile_id")
private StudentProfile studentProfile;

@ManyToOne
@JoinColumn (name = "achievement_id")
private Achievement achievement;

@NotNull
private LocalDateTime accomplishedDateTime;

public Long getId () {
    return this.id;
}

public void setId (Long id) {
    this.id = id; 
}

public StudentProfile getStudentProfile () {
    return this.studentProfile;
}

public void setStudentProfile (StudentProfile studentProfile) {
    this.studentProfile = studentProfile; 
}

public Achievement getAchievement () {
    return this.achievement;
}

public void setAchievement (Achievement achievement) {
    this.achievement = achievement; 
}

public LocalDateTime getAccomplishedDateTime () {
    return this.accomplishedDateTime;
}

public void setAccomplishedDateTime (LocalDateTime accomplishedDateTime) {
    this.accomplishedDateTime = accomplishedDateTime;
}

}
