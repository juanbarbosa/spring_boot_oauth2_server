package com.github.juanbarbosa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class OAuth2ResourceConfig extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
			// This is needed to give disable security to the h2-console resource dont expose h2 in production for your own good
			.authorizeRequests().antMatchers("/h2-console/**").permitAll() 
		.and()
			// make sure any other request is authenticated in order to work with oauth2
			.authorizeRequests().anyRequest().authenticated()
		.and()
			// the below code needed to consume the h2-console
			// reference: https://springframework.guru/using-the-h2-database-console-in-spring-boot-with-spring-security/
			.csrf().disable().headers().frameOptions().disable(); 
			
	}
}
