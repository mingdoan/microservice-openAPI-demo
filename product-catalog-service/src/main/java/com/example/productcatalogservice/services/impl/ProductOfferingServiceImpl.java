package com.example.productcatalogservice.services.impl;

import com.example.productcatalogservice.models.ProductOffering;
import com.example.productcatalogservice.repositories.ProductOfferingRepository;
import com.example.productcatalogservice.services.ProductOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductOfferingServiceImpl implements ProductOfferingService {
    @Autowired
    private ProductOfferingRepository repository;

    @Override
    public List<ProductOffering> getAll() {
        return repository.findAll();
    }

    @Override
    public ProductOffering save(ProductOffering productOffering) {
        return repository.save(productOffering);
    }
}
