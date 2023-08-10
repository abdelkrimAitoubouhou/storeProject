package com.example.storemanagement.repository;

import com.example.storemanagement.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireRepository extends JpaRepository<Comment, Long> {
}
