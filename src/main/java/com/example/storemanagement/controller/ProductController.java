package com.example.storemanagement.controller;

import com.example.storemanagement.entities.Product;
import com.example.storemanagement.repository.ProductRepository;
import com.example.storemanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/saveProduct")
    public void saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @PostMapping("/updateProduct")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @GetMapping("/findProductById")
    public Product findProductById(@RequestParam Long id) {
        return productService.findProductById(id);
    }



    @GetMapping("/findAllProduct")
    public List<Product> findAllProduct() {
        return productService.findAllProduct();
    }

    @GetMapping("/deleteProductById")
    public void deleteProductById(@RequestParam Long id) {
        productService.deleteProductById(id);
    }  @GetMapping("/deleteAllProduct")
    public void deleteAllProduct() {
        productService.deleteAllProduct();
    }
}






