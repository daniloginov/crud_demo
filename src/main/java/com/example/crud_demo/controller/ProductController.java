package com.example.crud_demo.controller;

import com.example.crud_demo.model.Product;
import com.example.crud_demo.service.ProductService;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAll(@RequestParam(defaultValue = "id") String sortBy) {
        return service.findAll(Sort.by(sortBy));
    }
}

