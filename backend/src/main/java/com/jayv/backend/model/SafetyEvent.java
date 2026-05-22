package com.jayv.backend.model;

import java.time.LocalDateTime;

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
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "tb_safetyevent")
public class SafetyEvent {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id; 

@NotNull
private LocalDateTime detectedAt; 

@NotNull
@Enumerated (EnumType.STRING)
private EventClassification eventClassification;

@Column (nullable = true)
private Boolean wasRetracted;


@Column (nullable = true) 
private String responseAfterAlert; 

@NotNull
@Enumerated (EnumType.STRING)
private WellbeingMode wellbeingMode; 

@ManyToOne
@JoinColumn (name = "studentprofile_id")
private StudentProfile studentProfile;

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public LocalDateTime getDetectedAt() {
    return detectedAt;
}

public void setDetectedAt(LocalDateTime detectedAt) {
    this.detectedAt = detectedAt;
}

public EventClassification getEventClassification() {
    return eventClassification;
}

public void setEventClassification(EventClassification eventClassification) {
    this.eventClassification = eventClassification;
}

public Boolean getWasRetracted() {
    return wasRetracted;
}

public void setWasRetracted(Boolean wasRetracted) {
    this.wasRetracted = wasRetracted;
}

public String getResponseAfterAlert() {
    return responseAfterAlert;
}

public void setResponseAfterAlert(String responseAfterAlert) {
    this.responseAfterAlert = responseAfterAlert;
}

public WellbeingMode getWellbeingMode() {
    return wellbeingMode;
}

public void setWellbeingMode(WellbeingMode wellbeingMode) {
    this.wellbeingMode = wellbeingMode;
}

public StudentProfile getStudentProfile() {
    return studentProfile;
}

public void setStudentProfile(StudentProfile studentProfile) {
    this.studentProfile = studentProfile;
} 

}
