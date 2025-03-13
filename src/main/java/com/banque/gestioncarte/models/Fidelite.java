package com.banque.gestioncarte.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "fidelite")
@Data
class Fidelite {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int pointsAcquis;
    private LocalDate dateDernierCredit;

    @ManyToOne
    private Client client;
}
