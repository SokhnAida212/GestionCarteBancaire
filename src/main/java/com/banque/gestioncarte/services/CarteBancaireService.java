package com.banque.gestioncarte.services;

import com.banque.gestioncarte.Interfaces.ICarteBancaire;
import com.banque.gestioncarte.models.CarteBancaire;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

public class CarteBancaireService implements ICarteBancaire {

    public CarteBancaire findById(Long id) {
        EntityManager em = JpaUtils.getEm();
        CarteBancaire carte = em.find(CarteBancaire.class, id);
        em.close();
        return carte;
    }

    public List<CarteBancaire> findAll() {
        EntityManager em = JpaUtils.getEm();
        List<CarteBancaire> cartes = em.createQuery("SELECT c FROM CarteBancaire c", CarteBancaire.class).getResultList();
        em.close();
        return cartes;
    }

    public void save(CarteBancaire carte) {
        EntityManager em = JpaUtils.getEm();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(carte);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void update(CarteBancaire carte) {
        EntityManager em = JpaUtils.getEm();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(carte);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void delete(CarteBancaire carte) {
        EntityManager em = JpaUtils.getEm();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            carte = em.merge(carte);
            em.remove(carte);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}