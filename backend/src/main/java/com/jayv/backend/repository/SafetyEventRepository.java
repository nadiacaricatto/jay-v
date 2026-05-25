package com.jayv.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayv.backend.model.SafetyEvent;

public interface SafetyEventRepository extends JpaRepository <SafetyEvent, Long>{

}
