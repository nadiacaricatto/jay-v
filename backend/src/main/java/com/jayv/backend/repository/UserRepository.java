package com.jayv.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayv.backend.model.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
