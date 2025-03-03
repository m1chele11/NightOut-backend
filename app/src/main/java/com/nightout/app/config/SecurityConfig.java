package com.nightout.app.config;

import com.nightout.app.security.FirebaseAuthenticatorFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


//@Configuration
//public class SecurityConfig {
//
//    private final FirebaseAuthenticatorFilter firebaseAuthenticationFilter;
//
//    public SecurityConfig(FirebaseAuthenticatorFilter firebaseAuthenticationFilter) {
//        this.firebaseAuthenticationFilter = firebaseAuthenticationFilter;
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/public/**").permitAll() // Public routes
//                .anyRequest().authenticated() // Secure all other routes
//                .and()
//                .addFilterBefore(firebaseAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//
//        return http.build();
//    }
//}
