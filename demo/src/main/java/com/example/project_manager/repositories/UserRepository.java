package com.example.project_manager.repositories;


import com.example.project_manager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    // Add any additional custom methods as needed

}

