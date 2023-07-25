package com.example.storemanagement.repository;

import com.example.storemanagement.entities.Command;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandRepository extends JpaRepository<Command, Long> {
}