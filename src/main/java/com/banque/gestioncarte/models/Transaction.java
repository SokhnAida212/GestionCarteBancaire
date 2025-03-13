package com.banque.gestioncarte.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name ="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TypeTransaction type;
    private double montant;
    private LocalDate date;
    private String commercant;
    @Enumerated(EnumType.STRING)
    private StatutTransaction statut;

    @ManyToOne
    private CarteBancaire carte;
}
