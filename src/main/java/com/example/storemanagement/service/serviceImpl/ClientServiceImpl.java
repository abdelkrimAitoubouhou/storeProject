package com.example.storemanagement.service.serviceImpl;

import com.example.storemanagement.entities.Client;
import com.example.storemanagement.repository.ClientRepository;
import com.example.storemanagement.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;


    @Override
    public void saveClient(Client client) {

        clientRepository.save(client);
    }

    @Override
    public void updateClient(Client client) {

        clientRepository.save(client);
    }

    @Override
    public Client findClientById(Long id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public List<Client> findAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public void deleteClientById(Long id) {

        clientRepository.deleteById(id);
    }

    @Override
    public void deleteAllClient() {
        clientRepository.deleteAll();
    }
}
