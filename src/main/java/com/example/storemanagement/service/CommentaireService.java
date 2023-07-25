package com.example.storemanagement.service;

import com.example.storemanagement.entities.Commentaire;
import com.example.storemanagement.repository.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentaireService {

    public void saveComment(Commentaire comment);
    public List<Commentaire> findAllComment();
    public Commentaire findCommentById(Long id);
    public void deleteCommentById(Long id);
    public void deleteAllComment();






}
