package com.banque.gestioncarte.Interfaces;

import com.banque.gestioncarte.models.Admin;
import java.util.List;

public interface IAdmin {
    Admin findById(Long id);

    List<Admin> findAll();

    void save(Admin admin);

    void update(Admin admin);

    void delete(long id);
}