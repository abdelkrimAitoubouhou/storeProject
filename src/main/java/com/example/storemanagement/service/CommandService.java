package com.example.storemanagement.service;

import com.example.storemanagement.entities.Command;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommandService {


    public void validateCommend();
    public void rejectCommend();

    public Command findCommandById(Long id);

    public List<Command> findAllCommands();

    public void deleteCommandById(Long id);
    public void deleteAllCommand();
}
