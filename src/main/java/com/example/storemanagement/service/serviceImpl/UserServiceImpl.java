package com.example.storemanagement.service.serviceImpl;

import com.example.storemanagement.entities.User;
import com.example.storemanagement.repository.UserRepository;
import com.example.storemanagement.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;


    @Override
    public void saveClient(User user) {

        userRepository.save(user);
    }

    @Override
    public void updateClient(User user) {

        userRepository.save(user);
    }

    @Override
    public User findClientById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> findAllClient() {
        return userRepository.findAll();
    }

    @Override
    public void deleteClientById(Long id) {

        userRepository.deleteById(id);
    }

    @Override
    public void deleteAllClient() {
        userRepository.deleteAll();
    }
}
