package com.example.storemanagement.controller;

import com.example.storemanagement.entities.User;
import com.example.storemanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserCotroller {

    @Autowired
    private UserService userService;

    @PostMapping("/admin/saveClient")
    public void saveClient(@RequestBody User user) {

        userService.saveClient(user);
    }


    @PutMapping ("/admin/updateClient")
    public void updateClient (@RequestBody User user) {
        userService.saveClient(user);
    }

    @GetMapping("/admin/findClientById")
    public User findClientById(@RequestParam Long id) {
        return userService.findClientById(id);
    }

    @GetMapping("/admin/findAllClient")
    public List<User> findAllClient() {
        return userService.findAllClient();
    }


    @DeleteMapping("/admin/deleteClientById")
    public void deleteClientById(@RequestParam Long id) {

        User user = userService.findClientById(id);

        if(user == null){
            throw new RuntimeException("user id not found " + id);
        }

        userService.deleteClientById(id);
    }

    @DeleteMapping("/admin/deleteAll")
    public void deleteAllClient() {

        userService.deleteAllClient();
    }
}
