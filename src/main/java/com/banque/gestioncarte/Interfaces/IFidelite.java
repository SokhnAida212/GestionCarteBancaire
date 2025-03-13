package com.banque.gestioncarte.Interfaces;

import com.banque.gestioncarte.models.Fidelite;
import java.util.List;

public interface IFidelite {

    Fidelite findById(Long id);

    List<Fidelite> findAll();

    void save(Fidelite fidelite);

    void update(Fidelite fidelite);

    void delete(Fidelite fidelite);
}