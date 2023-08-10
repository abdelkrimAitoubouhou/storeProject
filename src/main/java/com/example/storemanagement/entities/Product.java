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
@Table(name = "products")
public class Product{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private double price;
    private double quantity;

    @ManyToMany(mappedBy = "product")
    private Set<Command> command = new HashSet<>();

    @OneToMany(mappedBy = "product",
    fetch = FetchType.EAGER)
    private Set<Comment> comments = new HashSet<>();



}