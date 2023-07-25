package com.example.storemanagement.service;

import com.example.storemanagement.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {

    public void saveClient(Client client);
    public void updateClient(Client client);
    public Client findClientById(Long id);
    public List<Client> findAllClient();
    public void deleteClientById(Long id);
    public void deleteAllClient();


}
