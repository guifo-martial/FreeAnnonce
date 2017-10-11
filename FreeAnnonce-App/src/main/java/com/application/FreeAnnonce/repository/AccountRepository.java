package com.application.FreeAnnonce.repository;




import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.FreeAnnonce.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	Optional<Account> findByLogin(String login);

}
