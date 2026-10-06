package org.lesson.java.spring_la_mia_pizzeria_security.security;

import org.springframework.security.config.Customizer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

  @Bean
  @SuppressWarnings("removal")
  SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(requests -> requests
        .requestMatchers("/pizze/create", "/pizze/edit/**", "/pizze/*/offers").hasAuthority("ADMIN")
        .requestMatchers(HttpMethod.POST, "/pizze/**").hasAuthority("ADMIN")
        .requestMatchers("/offers/**", "/ingredients/**").hasAuthority("ADMIN")
        .requestMatchers("/pizze", "/pizze/**").hasAnyAuthority("USER", "ADMIN")
        .requestMatchers("/", "/css/**", "/js/**").permitAll()
        .anyRequest().authenticated())
        .formLogin(Customizer.withDefaults())
        .logout(Customizer.withDefaults());
    return http.build();
  }

  @Bean
  @SuppressWarnings("deprecation")
  DaoAuthenticationProvider authenticationProvider(DatabaseUserDetailService userDetailService,
      PasswordEncoder passwordEncoder) {
    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider(userDetailService);

    authProvider.setPasswordEncoder(passwordEncoder);
    return authProvider;
  }

  @Bean
  PasswordEncoder passwordEncoder() {
    return PasswordEncoderFactories.createDelegatingPasswordEncoder();
  }
}
