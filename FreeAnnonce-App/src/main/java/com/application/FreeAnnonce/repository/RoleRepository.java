package com.application.FreeAnnonce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.FreeAnnonce.entities.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer> {

}
