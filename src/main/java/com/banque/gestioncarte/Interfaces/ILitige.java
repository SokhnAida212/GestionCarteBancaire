package com.banque.gestioncarte.Interfaces;

import com.banque.gestioncarte.models.Litige;
import java.util.List;

public interface ILitige {
    Litige findById(Long id);
    List<Litige> findAll();
    void save(Litige litige);
    void update(Litige litige);
    void delete(Litige litige);
}