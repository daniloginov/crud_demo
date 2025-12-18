package com.example.crud_demo.service;

import com.example.crud_demo.model.Product;
import com.example.crud_demo.repository.ProductRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll(Sort sort) {
        return repository.findAll(sort);
    }
}

