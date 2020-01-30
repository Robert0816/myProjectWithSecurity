package com.wildcodeschool.myProjectWithSecurity.config;

//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;



public class WebSecurityConfigurerAdapter {
	
	

	// funktoniert nicht
			/*
					protected void configure(HttpSecurity http) throws Exception {
					    http
					       .authorizeRequests()
					            .anyRequest().authenticated()
					            .and()
					       .formLogin()
					            .and()
					        .httpBasic();
						}
			*/	
	
			
			/*
					protected void configure(AuthenticationManagerBuilder auth) throws Exception {
					
					PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
					auth.inMemoryAuthentication().withUser("user").password(encoder.encode("password")).roles("");
				    auth.inMemoryAuthentication().withUser("user").password("password").roles("");
					}
			*/
}
