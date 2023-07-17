package com.example.project_manager.entities;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Entity
@Table(name = "users")
public class User implements UserDetails {

    // Other properties and mappings
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Define the authorities/roles for the user (e.g., "ROLE_USER", "ROLE_ADMIN")
        return Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
    }
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Update this based on your business logic for account expiration
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Update this based on your business logic for account locking
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Update this based on your business logic for credentials expiration
    }

    @Override
    public boolean isEnabled() {
        return true; // Update this based on your business logic for enabling/disabling accounts
    }


        public void setUsername(String username) {
            this.username = username;
        }

    public void setPassword(String password) {
        this.password= password;
    }


    // Setters and other methods

}
