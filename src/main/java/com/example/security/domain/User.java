package com.example.security.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "Users")
@Entity @Getter @Setter @ToString
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String userId;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    private String socialId;
}
