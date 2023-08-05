package com.example.storemanagement.authentication.services;

import com.example.storemanagement.authentication.entities.UserDto;
import com.example.storemanagement.authentication.entities.Roles;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {


public UserDto getUserByUserName(String username);
public List<UserDto> getAllUsers();
public void addRoleToUser(String username, String role);
public void deleteRoleFromUser(String username, String role);
public UserDto addNewUser(String username, String password, String confirmPassword, String email);
public Roles addNewRole(String role);


}
