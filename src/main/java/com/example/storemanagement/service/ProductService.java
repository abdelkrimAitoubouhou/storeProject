package com.example.storemanagement.service;

import com.example.storemanagement.entities.Client;
import com.example.storemanagement.entities.Command;
import com.example.storemanagement.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public void saveProduct(Product product);
    public void updateProduct(Product product);
    public Product findProductById(Long id);
    public List<Product> findAllProduct();
    public void deleteProductById(Long id);
    public void deleteAllProduct();


}
