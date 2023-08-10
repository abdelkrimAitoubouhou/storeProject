package com.example.storemanagement.authentication.services.serviceImpl;

import com.example.storemanagement.authentication.entities.UserDto;
import com.example.storemanagement.authentication.entities.Roles;
import com.example.storemanagement.authentication.repositories.UserDtoRepository;
import com.example.storemanagement.authentication.repositories.RoleRepository;
import com.example.storemanagement.authentication.services.AccountService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
@NoArgsConstructor
public class AccountServiceImpl implements AccountService {

    @Autowired
    private UserDtoRepository userDtoRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public UserDto getUserByUserName(String username) {
        return userDtoRepository.findByUsername(username) ;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userDtoRepository.findAll();
    }

    @Override
    public void addRoleToUser(String username, String role) {

            UserDto userDto = userDtoRepository.findByUsername(username);
            if (userDto == null) {
                throw new IllegalArgumentException("User not found");
            }

            Roles roles = roleRepository.findByRoleName(role);
            if (role == null) {
                // You can create the role here if it doesn't exist in the database
                roles = new Roles();
                roles.setRoleName(role);
                roleRepository.save(roles);
            }

            userDto.getRoles().add(roles);

            userDtoRepository.save(userDto);

    }

    @Override
    public void deleteRoleFromUser(String username, String role) {

        UserDto userDto = userDtoRepository.findByUsername(username);
        if (userDto == null) {
            throw new IllegalArgumentException("User not found");
        }

        Roles roles = roleRepository.findByRoleName(role);
        if (role == null) {
            throw new RuntimeException("Role not found!");
        }

        userDto.getRoles().remove(roles);

        userDtoRepository.save(userDto);
    }

    @Override
    public UserDto addNewUser(String username, String password, String confirmPassword, String email) {

        UserDto userDto = userDtoRepository.findByUsername(username);
        if(userDto !=null) throw new RuntimeException("User already exist");
        if(password!= confirmPassword) throw new RuntimeException("PassWords not matched");

        userDto = UserDto.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .confirmPassWord(passwordEncoder.encode(confirmPassword))
                .eamil(email)
                .build();

        return userDtoRepository.save(userDto);
    }


    @Override
    public Roles addNewRole(String role) {
        Roles roles = roleRepository.findByRoleName(role);
        if (roles != null) {
            throw new IllegalArgumentException("Role already exist");
        }

        roles = Roles.builder()
                .roleName(role)
                .build();
        return roleRepository.save(roles);
    }
}
