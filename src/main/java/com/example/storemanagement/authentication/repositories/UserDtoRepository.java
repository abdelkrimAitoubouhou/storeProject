package com.example.storemanagement.authentication.repositories;

import com.example.storemanagement.authentication.entities.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDtoRepository extends JpaRepository<UserDto, Long> {
    UserDto findByUsername(String username);
}
