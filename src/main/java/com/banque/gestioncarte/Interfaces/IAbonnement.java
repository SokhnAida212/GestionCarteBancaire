package com.banque.gestioncarte.Interfaces;

import com.banque.gestioncarte.models.Abonnement;
import java.util.List;

public interface IAbonnement {
    Abonnement findById(Long id);
    List<Abonnement> findAll();
    void save(Abonnement abonnement);
    void update(Abonnement abonnement);
    void delete(Abonnement abonnement);
}