package com.banque.gestioncarte.Interfaces;

import com.banque.gestioncarte.models.CarteBancaire;
import java.util.List;

public interface ICarteBancaire {
    CarteBancaire findById(Long id);
    List<CarteBancaire> findAll();
    void save(CarteBancaire carte);
    void update(CarteBancaire carte);
    void delete(CarteBancaire carte);
}