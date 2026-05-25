package com.jayv.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayv.backend.model.StudentProfile;

public interface StudentProfileRepository extends JpaRepository <StudentProfile, Long> {

}
