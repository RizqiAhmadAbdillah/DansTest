package com.dmp.dmp.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmp.dmp.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
