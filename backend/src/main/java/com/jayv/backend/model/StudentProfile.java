package com.jayv.backend.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="tb_studentprofile")
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @OneToOne
    @JoinColumn (name = "user_id")
    private User user;

    @NotNull
    private Long level; 

    @NotNull
    private Long xp; 

    @NotNull
    private Long currentStreak;

    @NotNull
    private LocalDateTime lastActiveDate; 

    @OneToMany (mappedBy = "studentProfile")
    private List<ExerciseSubmission> exerciseSubmissions; 

    @OneToMany (mappedBy = "studentProfile")
    private List<SafetyEvent> safetyEvents; 

    @OneToMany (mappedBy = "studentProfile")
    private List<StudentSkill> studentSkills; 

    @OneToMany (mappedBy = "studentProfile")
    private List<StudentAchievement> studentAchievements;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getXp() {
        return xp;
    }

    public void setXp(Long xp) {
        this.xp = xp;
    }

    public Long getCurrentStreak() {
        return currentStreak;
    }

    public void setCurrentStreak(Long currentStreak) {
        this.currentStreak = currentStreak;
    }

    public LocalDateTime getLastActiveDate() {
        return lastActiveDate;
    }

    public void setLastActiveDate(LocalDateTime lastActiveDate) {
        this.lastActiveDate = lastActiveDate;
    }

    public List<ExerciseSubmission> getExerciseSubmissions() {
        return exerciseSubmissions;
    }

    public void setExerciseSubmissions(List<ExerciseSubmission> exerciseSubmissions) {
        this.exerciseSubmissions = exerciseSubmissions;
    }

    public List<SafetyEvent> getSafetyEvents() {
        return safetyEvents;
    }

    public void setSafetyEvents(List<SafetyEvent> safetyEvents) {
        this.safetyEvents = safetyEvents;
    }

    public List<StudentSkill> getStudentSkills() {
        return studentSkills;
    }

    public void setStudentSkills(List<StudentSkill> studentSkills) {
        this.studentSkills = studentSkills;
    }

    public List<StudentAchievement> getStudentAchievements() {
        return studentAchievements;
    }

    public void setStudentAchievements(List<StudentAchievement> studentAchievements) {
        this.studentAchievements = studentAchievements;
    } 
}   
