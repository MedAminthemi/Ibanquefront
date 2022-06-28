package com.example.IBanque.repository;

import com.example.IBanque.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUsername(String username); // authentification
    Optional<User> findByEmail(String email); // authentification
    Boolean existsByUsername(String username); //subscribe
    Boolean existsByEmail(String email); //subscribe

}