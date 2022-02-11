package com.example.productcatalogservice.services;

import com.example.productcatalogservice.models.ProductSpecification;

import java.util.List;

public interface ProductSpecificationService {
    List<ProductSpecification> getAll();
    ProductSpecification save(ProductSpecification productSpecification);
}
