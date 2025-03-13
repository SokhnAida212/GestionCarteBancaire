package com.banque.gestioncarte.Interfaces;

import com.banque.gestioncarte.models.AuthentificationTransaction;
import java.util.List;

public interface IAuthentificationTransaction {
    AuthentificationTransaction findById(Long id);
    List<AuthentificationTransaction> findAll();
    void save(AuthentificationTransaction auth);
    void update(AuthentificationTransaction auth);
    void delete(AuthentificationTransaction auth);
}