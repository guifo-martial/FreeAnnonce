package com.application.FreeAnnonce.WebService;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.application.FreeAnnonce.entities.Account;
import com.application.FreeAnnonce.repository.AccountRepository;
import com.application.FreeAnnonce.security.model.CustumUserDetails;




@Service
public class CustumUserDetailService implements UserDetailsService {


	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Account> accountOptional = accountRepository.findByLogin(username);
		
		accountOptional
		.orElseThrow(()-> new UsernameNotFoundException("Username not found"));
		
		return accountOptional.map(CustumUserDetails::new).get();		
		
		
	}


}
