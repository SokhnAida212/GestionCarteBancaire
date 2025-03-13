package com.banque.gestioncarte.models;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;
@Entity
@Data
@Table(name="abonnement")
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String service;
    private double montant;
    private LocalDate datePrelevement;
    @Enumerated(EnumType.STRING)
    private StatutAbonnement statut;

    @ManyToOne
    private CarteBancaire carte;
}
