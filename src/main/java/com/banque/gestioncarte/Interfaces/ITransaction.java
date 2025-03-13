package com.banque.gestioncarte.Interfaces;

import com.banque.gestioncarte.models.Transaction;
import java.util.List;

public interface ITransaction {
    Transaction findById(Long id);
    List<Transaction> findAll();
    void save(Transaction transaction);
    void update(Transaction transaction);
    void delete(Transaction transaction);
}
