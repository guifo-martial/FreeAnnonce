/**
 * 
 */
package com.application.FreeAnnonce.com.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@Configuration
public class webMVCConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		//route  avec ".html" vas chercher dans stactic sinon vas chercher dans template 
		
		//registry.addViewController("/inscription").setViewName("inscription");
       // registry.addViewController("/").setViewName("inscription");
		registry.addViewController("/utilisateurs").setViewName("utilisateurs");
		registry.addViewController("/").setViewName("login");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("logout").setViewName("login");
	}
}
