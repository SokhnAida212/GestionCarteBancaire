package com.banque.gestioncarte.services;


import com.banque.gestioncarte.Interfaces.IAdmin;
import com.banque.gestioncarte.Interfaces.ITransaction;
import com.banque.gestioncarte.models.Transaction;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

public class TransactionService implements ITransaction {

    public Transaction findById(Long id) {
        EntityManager em = JpaUtils.getEm();
        Transaction transaction = em.find(Transaction.class, id);
        em.close();
        return transaction;
    }

    public List<Transaction> findAll() {
        EntityManager em = JpaUtils.getEm();
        List<Transaction> transactions = em.createQuery("SELECT t FROM Transaction t", Transaction.class).getResultList();
        em.close();
        return transactions;
    }

    public void save(Transaction transaction) {
        EntityManager em = JpaUtils.getEm();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(transaction);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void update(Transaction transaction) {
        EntityManager em = JpaUtils.getEm();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(transaction);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void delete(Transaction transaction) {
        EntityManager em = JpaUtils.getEm();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            transaction = em.merge(transaction);
            em.remove(transaction);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}