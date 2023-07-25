package com.example.storemanagement.controller;

import com.example.storemanagement.entities.Command;
import com.example.storemanagement.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commands")
public class CommandController {

    @Autowired
    private CommandService commandService;

    @GetMapping("/findCommandById")
    public Command findCommandById(@RequestParam Long id) {
        return commandService.findCommandById(id);
    }

    @GetMapping("/findAllCommands")
    public List<Command> findAllCommands() {
        return commandService.findAllCommands();
    }

    @GetMapping("/deleteCommandById")
    public void deleteCommandById(Long id) {
        commandService.deleteCommandById(id);
    }
 @GetMapping("/deleteAllCommand")
    public void deleteAllCommand() {
        commandService.deleteAllCommand();
    }


}
