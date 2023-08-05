package com.example.storemanagement.service;

import com.example.storemanagement.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public void saveClient(User user);
    public void updateClient(User user);
    public User findClientById(Long id);
    public List<User> findAllClient();
    public void deleteClientById(Long id);
    public void deleteAllClient();


}
