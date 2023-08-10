package com.example.storemanagement.authentication.controller;

import com.example.storemanagement.authentication.entities.UserDto;
import com.example.storemanagement.authentication.entities.Roles;
import com.example.storemanagement.authentication.services.AccountService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/connexion")
@AllArgsConstructor
@NoArgsConstructor
public class AuthController {
    @Autowired
    private AccountService accountService;


    @GetMapping("/admin/getUserByUserName")
    public UserDto getUserByUserName(@RequestParam String username) {
        return accountService.getUserByUserName(username);
    }



    @GetMapping("/admin/getAllUsers")
    public List<UserDto> getAllUsers() {
        return accountService.getAllUsers();
    }

    @PostMapping("/admin/addRoleToUser")
    public void addRoleToUser(@RequestBody String username, @RequestBody String role) {
        accountService.addRoleToUser(username, role);
    }

    @DeleteMapping("/admin/deleteRoleFromUser")
    public void deleteRoleFromUser(@RequestParam String username, @RequestParam String role) {
        accountService.addRoleToUser(username, role);
    }


    @PostMapping("/admin/addNewUser")
    public UserDto addNewUser(@RequestBody String username, @RequestBody String password,
                                String confirmPassword, String email) {

        return accountService.addNewUser(username, password, confirmPassword, email);

    }



    @PostMapping("/admin/addNewRole")
    public Roles addNewRole(@RequestBody String role) {
        return accountService.addNewRole(role);
    }


    @GetMapping("/notAuthorized")
    public String notAuthorized() {
        return "You are not authorized to do it !";


    }

}
