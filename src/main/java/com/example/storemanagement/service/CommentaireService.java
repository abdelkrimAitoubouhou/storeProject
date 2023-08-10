package com.example.storemanagement.service;

import com.example.storemanagement.entities.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentaireService {

    public void saveComment(Comment comment);
    public List<Comment> findAllComment();
    public Comment findCommentById(Long id);
    public void deleteCommentById(Long id);
    public void deleteAllComment();






}
