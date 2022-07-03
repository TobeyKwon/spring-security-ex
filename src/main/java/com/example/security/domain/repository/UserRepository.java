package com.example.security.domain.repository;

import com.example.security.domain.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserAccount, Long> {
    Optional<UserAccount> findByUserId(String userId);
    Optional<UserAccount> findBySocialId(String socialId);

    boolean existsByUserId(String userId);
}
