package com.application.FreeAnnonce.com.security;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.access.expression.WebSecurityExpressionRoot;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true)
public class SecutityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	public void globalConfig(AuthenticationManagerBuilder auth, DataSource datasource) throws Exception{
		
		// utilisateur en memoire
		
		auth.inMemoryAuthentication()
			.withUser("admin")
			.password("admin")
			.roles("ADMIN");
		
		auth.inMemoryAuthentication()
			.withUser("prof")
			.password("prof")
			.roles("PROF");
		
		auth.inMemoryAuthentication()
			.withUser("etudiant")
			.password("etudiant")
			.roles("ETUDIANT");
			
			
		
		/*auth.jdbcAuthentication()
			.dataSource(datasource)
			.usersByUsernameQuery("select username as principal, password as credentials,true"
					+ " from user where username=?")
			.authoritiesByUsernameQuery("select user_username as principal, role_role as role "
					+ "from users_roles where user_username = ?")
			.rolePrefix("ROLE_");*/
			
		
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
