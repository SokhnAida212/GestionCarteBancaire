package com.banque.gestioncarte.Interfaces;

import com.banque.gestioncarte.models.Client;

import java.util.List;


public interface IClient{

    Client findById(Long id);

    List<Client> findAll();

    void save(Client client);

    void update(Client client);

    void delete(Client client);
}
