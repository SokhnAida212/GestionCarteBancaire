package com.banque.gestioncarte.models;

import jakarta.persistence.*;

import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name="authentification")
public class AuthentificationTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String codeOtp;
    @Column(nullable = false)
    private LocalDate dateGeneration;
    @Enumerated(EnumType.STRING)
    private StatutTransaction statut;

    @OneToOne
    private Transaction transaction;
}
