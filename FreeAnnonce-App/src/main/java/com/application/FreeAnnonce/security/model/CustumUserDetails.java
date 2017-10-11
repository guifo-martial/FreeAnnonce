package com.application.FreeAnnonce.security.model;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.application.FreeAnnonce.entities.Account;

public class CustumUserDetails extends Account implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6450250132136870810L;

	
	
	public CustumUserDetails(final Account account) {
		super(account);
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return getRoles()
				.stream()
				.map(role-> new SimpleGrantedAuthority("ROLE_"+role.getName()))
				.collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		// password from account.class
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		
		return super.getLogin();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return super.getIsActiveAccount();
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
