package com.example.storemanagement.service.serviceImpl;

import com.example.storemanagement.entities.Commentaire;
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
    public void saveComment(Commentaire comment) {
        commentaireRepository.save(comment);
    }

    @Override
    public List<Commentaire> findAllComment() {
        return commentaireRepository.findAll();
    }

    @Override
    public Commentaire findCommentById(Long id) {
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
