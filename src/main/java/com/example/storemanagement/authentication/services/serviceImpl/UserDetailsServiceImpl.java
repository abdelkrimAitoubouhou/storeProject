package com.example.storemanagement.authentication.services.serviceImpl;

import com.example.storemanagement.authentication.entities.UserDto;
import com.example.storemanagement.authentication.entities.Roles;
import com.example.storemanagement.authentication.services.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private AccountService accountService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDto userDto = accountService.getUserByUserName(username);
        if(userDto ==null ) throw new UsernameNotFoundException("User not found");
        UserDetails userDetails = User.withUsername(userDto.getUsername())
                .password(userDto.getPassword())
                .roles(userDto.getRoles().stream().map(Roles::getRoleName).toArray(String[]::new))
                .build();

        return userDetails;
    }
}
