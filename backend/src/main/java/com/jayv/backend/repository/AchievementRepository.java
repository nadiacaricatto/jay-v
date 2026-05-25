package com.jayv.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayv.backend.model.Achievement;

public interface AchievementRepository extends JpaRepository <Achievement, Long> {

}
