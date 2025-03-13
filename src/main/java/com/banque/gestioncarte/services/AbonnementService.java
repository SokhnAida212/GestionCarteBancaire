package com.banque.gestioncarte.services;

import com.banque.gestioncarte.Interfaces.IAbonnement;
import com.banque.gestioncarte.models.Abonnement;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class AbonnementService implements IAbonnement {
    public Abonnement findById(Long id) {
        EntityManager em = JpaUtils.getEm();
        Abonnement abonnement = em.find(Abonnement.class, id);
        em.close();
        return abonnement;
    }

    public List<Abonnement> findAll() {
        EntityManager em = JpaUtils.getEm();
        List<Abonnement> abonnements = em.createQuery("SELECT a FROM Abonnement a", Abonnement.class).getResultList();
        em.close();
        return abonnements;
    }

    public void save(Abonnement abonnement) {
        EntityManager em = JpaUtils.getEm();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(abonnement);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void update(Abonnement abonnement) {
        EntityManager em = JpaUtils.getEm();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(abonnement);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void delete(Abonnement abonnement) {
        EntityManager em = JpaUtils.getEm();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            abonnement = em.merge(abonnement);
            em.remove(abonnement);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
