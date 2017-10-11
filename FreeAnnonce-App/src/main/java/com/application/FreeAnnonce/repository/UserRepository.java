package com.application.FreeAnnonce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.FreeAnnonce.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
