package com.example.storemanagement.service.serviceImpl;

import com.example.storemanagement.entities.Command;
import com.example.storemanagement.repository.CommandRepository;
import com.example.storemanagement.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandServiceImpl implements CommandService {

    @Autowired
    private CommandRepository commandRepository;


    @Override
    public void validateCommend() {

    }

    @Override
    public void rejectCommend() {

    }

    @Override
    public Command findCommandById(Long id) {
        return commandRepository.findById(id).get();
    }

    @Override
    public List<Command> findAllCommands() {
        return commandRepository.findAll();
    }

    @Override
    public void deleteCommandById(Long id) {
        commandRepository.deleteById(id);
    }

    @Override
    public void deleteAllCommand() {
        commandRepository.deleteAll();
    }
}
