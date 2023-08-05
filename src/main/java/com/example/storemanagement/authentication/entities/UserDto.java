package com.example.storemanagement.authentication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class UserDto {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String username;
   private String eamil;
   private String password;
   private String confirmPassWord;

   @ManyToMany(fetch = FetchType.EAGER)
   private Set<Roles> roles = new HashSet<>();

}
