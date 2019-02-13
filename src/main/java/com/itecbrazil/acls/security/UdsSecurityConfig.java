/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itecbrazil.acls.security;

import com.itecbrazil.acls.service.ImplementsUserDetailsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Itec
 */
@Configuration
public class UdsSecurityConfig {
    @Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder,
                        PasswordEncoder passwordEncoder, 
			ImplementsUserDetailsServices userDetailsService) throws Exception {
		builder
			.userDetailsService(userDetailsService)
                        .passwordEncoder(passwordEncoder);
	}
}
