package com.example.productcatalogservice.services.impl;

import com.example.productcatalogservice.models.ProductSpecification;
import com.example.productcatalogservice.repositories.ProductSpecificationRepository;
import com.example.productcatalogservice.services.ProductSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductSpecificationServiceImpl implements ProductSpecificationService {
    @Autowired
    private ProductSpecificationRepository repository;

    @Override
    public List<ProductSpecification> getAll() {
        return repository.findAll();
    }

    @Override
    public ProductSpecification save(ProductSpecification productSpecification) {
        return repository.save(productSpecification);
    }
}
