package org.lesson.java.spring_la_mia_pizzeria_security.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.lesson.java.spring_la_mia_pizzeria_security.model.Role;
import org.lesson.java.spring_la_mia_pizzeria_security.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class DatabaseUserDetail implements UserDetails {
  private final Integer id;
  private final String username;
  private final String email;
  private final String password;
  private final Set<GrantedAuthority> permission;

  public DatabaseUserDetail(User user) {
    this.id = user.getId();
    this.username = user.getUserName();
    this.email = user.getEmail();
    this.password = user.getPassword();
    this.permission = new HashSet<>();

    for (Role userRole : user.getRoles()) {
      permission.add(new SimpleGrantedAuthority(userRole.getName()));
    }
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return this.permission;
  }

  @Override
  public @Nullable String getPassword() {
    return this.password;
  }

  @Override
  public String getUsername() {
    return this.username;
  }

}
