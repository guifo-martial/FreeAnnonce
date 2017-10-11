package com.application.FreeAnnonce.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.application.FreeAnnonce.WebService.CustumUserDetailService;
import com.application.FreeAnnonce.repository.AccountRepository;



@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true, prePostEnabled = true)
@EnableJpaRepositories(basePackageClasses = AccountRepository.class)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private CustumUserDetailService custumUserDetailService; 

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder)
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		super.configure(auth);
		
		auth.userDetailsService(custumUserDetailService)
		.passwordEncoder(getPasswordEncoder());
	}
	

	

	private PasswordEncoder getPasswordEncoder() {
		return new PasswordEncoder() {
			
			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				return true;
			}
			
			@Override
			public String encode(CharSequence rawPassword) {
				return rawPassword.toString();
			}
		};
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(http);
		
		
		http
		.csrf().disable()		//csrf permet d'injecter des jetton d'authentification
								//dans les pages 
		
		.authorizeRequests()
			.antMatchers("/CSS/**","/JS/**","/images/**","/").permitAll()
			//.antMatchers("/CSS/**","/JS/**","/images/**","/").permitAll()
			.anyRequest().authenticated()
			.and()
		.formLogin()
        .loginPage("/login")
        .permitAll()
        .defaultSuccessUrl("/home")
        .and()
        .logout()
        .permitAll();
	}


}
