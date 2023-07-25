package com.example.storemanagement.controller;

import com.example.storemanagement.entities.Client;
import com.example.storemanagement.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientCotroller {

    @Autowired
    private ClientService clientService;

    @PostMapping("/saveClient")
    public void saveClient(@RequestBody Client client) {

        clientService.saveClient(client);
    }


    @PostMapping("/updateClient")
    public void updateClient(@RequestBody Client client) {
        clientService.saveClient(client);
    }

    @GetMapping("/findClientById")
    public Client findClientById(@RequestParam Long id) {
        return clientService.findClientById(id);
    }

    @GetMapping("/findAllClient")
    public List<Client> findAllClient() {
        return clientService.findAllClient();
    }


    @GetMapping("/deleteClientById")
    public void deleteClientById(@RequestParam Long id) {

        clientService.deleteClientById(id);
    }

    @GetMapping("/deleteAll")
    public void deleteAllClient() {

        clientService.deleteAllClient();
    }


}
