package com.banque.gestioncarte.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
public class CarteBancaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false,length=50)
    private String numero;
    @Column(nullable=false,length=4)
    private String cvv;
    @Column(nullable=false)
    private LocalDate dateExpiration;
    @Column(nullable=false)
    private double solde;
    @Enumerated(EnumType.STRING)
    private StatusCarte statut;
    @Column(nullable=false)
    private double limiteJournaliere;
    private double cashback;

    @ManyToOne
    private Client client;
}
