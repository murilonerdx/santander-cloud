package com.murilonerdx.santander.controller;

import com.murilonerdx.santander.model.Product;
import com.murilonerdx.santander.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value="/product")
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping(method= RequestMethod.POST)
    Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @RequestMapping(value="/{id}")
    Optional<Product> findById(@PathVariable Long id){
        return productRepository.findById(id);
    }
}
