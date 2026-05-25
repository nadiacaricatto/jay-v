package com.jayv.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayv.backend.model.StudentAchievement;

public interface StudentAchievementRepository extends JpaRepository <StudentAchievement, Long> {

}
