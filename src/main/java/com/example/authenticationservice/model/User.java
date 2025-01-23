package com.example.authenticationservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Data
@Entity
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Column(unique = true, nullable = false)
    private String username;


    @Getter
    @Column(nullable = false)
    private String password;

    @Getter
    private String role; // e.g., ROLE_USER, ROLE_ADMIN

}
