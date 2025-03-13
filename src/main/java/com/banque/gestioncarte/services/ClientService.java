package com.banque.gestioncarte.services;

import com.banque.gestioncarte.Interfaces.IClient;
import com.banque.gestioncarte.models.Admin;
import com.banque.gestioncarte.models.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

public class ClientService implements IClient {

    public Client findById(Long id) {
        EntityManager em = JpaUtils.getEm();
        Client client = em.find(Client.class, id);
        em.close();
        return client;
    }

    public List<Client> findAll() {
        EntityManager em = JpaUtils.getEm();
        List<Client> clients = em.createQuery("SELECT c FROM Client c", Client.class).getResultList();
        em.close();
        return clients;
    }

    public void save(Client client) {
        EntityManager em = JpaUtils.getEm();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(client);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void update(Client client) {
        EntityManager em = JpaUtils.getEm();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(client);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void delete(Long id) {
        EntityManager em = JpaUtils.getEm();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            Client client = em.find(Client.class, id);
            if (client != null) {
                em.remove(client);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}