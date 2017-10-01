package com.application.FreeAnnonce.com.WebService;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.FreeAnnonce.com.entities.Account;
import com.application.FreeAnnonce.com.repository.AccountRepository;

@RestController
@RequestMapping(value="/ws")
public class RegisterRestService {
	
	AccountRepository accountService;
	
	@RequestMapping(value="/create", method = RequestMethod.POST )
	public Account create(@RequestBody Account account ){
		return accountService.save(account);
	}

}
