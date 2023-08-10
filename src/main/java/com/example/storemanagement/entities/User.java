package com.example.storemanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    private String userName;
    private String PassWord;



    @OneToMany(mappedBy = "user",
    fetch = FetchType.EAGER)
    private Set<Comment> comment = new HashSet<>();


    @OneToMany(mappedBy = "user")
    private Set<Command> command = new HashSet<>();




}



