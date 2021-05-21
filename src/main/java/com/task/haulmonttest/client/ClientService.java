package com.task.haulmonttest.client;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientDao clientDao;

    public ClientService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public List<Client> getAll() {
        return clientDao.findAll();
    }

    public void save(Client client) {
        clientDao.save(client);
    }
}
