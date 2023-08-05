package com.example.storemanagement;

import com.example.storemanagement.authentication.services.AccountService;
import com.example.storemanagement.entities.User;
import com.example.storemanagement.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.HashSet;

@SpringBootApplication
public class StoreManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreManagementApplication.class, args);
    }

@Bean
    CommandLineRunner runUserAuthentication(AccountService accountService){
        return args -> {
            //add users
            accountService.addNewUser("user", "user123", "user123", "user@gmail.com");
            accountService.addNewUser("karim", "karim1234", "karim1234", "karim@gmail.com" );

            //add roles
            accountService.addNewRole("ADMIN");
            accountService.addNewRole("USER");

            //add roles to users
            accountService.addRoleToUser("user", "USER");
            accountService.addRoleToUser("karim", "ADMIN");

        };
}


@Bean
   CommandLineRunner commandLineRunner(UserService userService){
        return args -> {
            userService.saveClient(new User(null, "user1", "user1@gmail.com"
                    , "user1","user123", new HashSet<>(),new HashSet<>()));

            userService.saveClient(new User(null, "user2", "user2@gmail.com"
                    , "user2","user234", new HashSet<>(),new HashSet<>()));

            userService.saveClient(new User(null, "user3", "user3@gmail.com"
                    , "user3","user345", new HashSet<>(),new HashSet<>()));
        };
}





    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
