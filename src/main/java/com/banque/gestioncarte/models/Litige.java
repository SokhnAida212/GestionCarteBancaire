package com.banque.gestioncarte.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "litige")
@Data
public class Litige {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String motif;
    private LocalDate dateSignalement;
    @Enumerated(EnumType.STRING)
    private StatutLitige statut;

    @ManyToOne
    private Transaction transaction;

    @ManyToOne
    private Admin admin;
}

