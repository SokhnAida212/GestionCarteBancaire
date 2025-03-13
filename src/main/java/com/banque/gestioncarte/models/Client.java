package com.banque.gestioncarte.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name ="Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nom",length=50,nullable=false)
    private String nom;
    @Column(name="prenom",length=50,nullable=false)
    private String prenom;
    @Column(name="email",length=90,unique = true,nullable=false)
    private String email;
    @Column(name="telephone",length=20,unique = true,nullable=false)
    private String telephone;
    @Column(name="adresse",length=90)
    private String adresse;
    @Column(nullable=false,name = "dateInscription")
    private LocalDate dateInscription;
}
