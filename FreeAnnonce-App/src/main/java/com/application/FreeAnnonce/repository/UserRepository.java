package com.application.FreeAnnonce.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.FreeAnnonce.com.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
