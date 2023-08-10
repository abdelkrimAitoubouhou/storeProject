package com.example.storemanagement.service.serviceImpl;

import com.example.storemanagement.entities.Comment;
import com.example.storemanagement.repository.CommentaireRepository;
import com.example.storemanagement.service.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaireServiceImpl implements CommentaireService {

    @Autowired
    private CommentaireRepository commentaireRepository;

    @Override
    public void saveComment(Comment comment) {
        commentaireRepository.save(comment);
    }

    @Override
    public List<Comment> findAllComment() {
        return commentaireRepository.findAll();
    }

    @Override
    public Comment findCommentById(Long id) {
        return commentaireRepository.findById(id).get();
    }

    @Override
    public void deleteCommentById(Long id) {
        commentaireRepository.deleteById(id);
    }

    @Override
    public void deleteAllComment() {
        commentaireRepository.deleteAll();
    }
}
