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
@Table (name = "tb_skillrecord")
public class SkillRecord {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id; 
    
    @NotNull
    private Double scoreAtTime;

    @NotNull
    private LocalDateTime recordedAt;

    @ManyToOne
    @JoinColumn (name = "studentSkill_id", nullable = false)
    private StudentSkill studentSkill;

    public Long getId () {
        return this.id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public Double getScoreAtTime () {
        return this.scoreAtTime;
    }

    public void setScoreAtTime (Double scoreAtTime) {
        this.scoreAtTime = scoreAtTime; 
    }

    public LocalDateTime getRecordedAt () {
        return this.recordedAt;
    }

    public void setRecordedAt (LocalDateTime recordedAt) {
        this.recordedAt = recordedAt; 
    }

    public StudentSkill getStudentSkill () {
        return this.studentSkill;
    }

    public void setStudentSkill (StudentSkill studentSkill) {
        this.studentSkill = studentSkill;
    }

}

