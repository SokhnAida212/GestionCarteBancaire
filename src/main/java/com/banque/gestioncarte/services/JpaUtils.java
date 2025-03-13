package com.banque.gestioncarte.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtils {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("banquePU");

    public static EntityManager getEm() {
        return emf.createEntityManager();
    }

    public static void closeEntityManagerFactory() {
        if (emf != null) {
            emf.close();
        }
    }
}
