package com.jayv.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayv.backend.model.SkillRecord;

public interface SkillRecordRepository extends JpaRepository <SkillRecord, Long> {

}
