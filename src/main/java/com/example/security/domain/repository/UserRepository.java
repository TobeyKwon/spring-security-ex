package com.example.security.domain.repository;

import com.example.security.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserId(String userId);
    Optional<User> findBySocialId(String socialId);

    boolean existsByUserId(String userId);
}
