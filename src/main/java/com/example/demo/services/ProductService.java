package com.example.demo.services;
import com.example.demo.entities.ProductEntity;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> find() {
        return productRepository.findAll();
    }
}