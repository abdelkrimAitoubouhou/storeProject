package com.example.storemanagement.repository;

import com.example.storemanagement.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
