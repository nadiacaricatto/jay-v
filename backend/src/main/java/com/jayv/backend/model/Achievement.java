package com.jayv.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "tb_achievement")
public class Achievement {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id;

@NotNull
@Enumerated (EnumType.STRING)
private AchievementType achievementType; 

@NotBlank
private String title;

@NotBlank
private String description;

public Long getId () {
    return this.id;
}

public void setId (Long id) {
    this.id = id;
}

public AchievementType getAchievementType () {
    return this.achievementType;
}

public void setAchievementType (AchievementType achievementType) {
    this.achievementType = achievementType; 
}

public String getTitle () {
    return this.title;
}

public void setTitle (String title) {
    this.title = title;
}

public String getDescription () {
    return this.description;
}

public void setDescription (String description) {
    this.description = description;
}
}
