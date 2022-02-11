package com.example.productcatalogservice.services.impl;

import com.example.productcatalogservice.models.ProductOfferingPrice;
import com.example.productcatalogservice.repositories.ProductOfferingPriceRepository;
import com.example.productcatalogservice.services.ProductOfferingPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductOfferingPriceServiceImpl implements ProductOfferingPriceService {
    @Autowired
    private ProductOfferingPriceRepository repository;

    @Override
    public List<ProductOfferingPrice> getAll() {
        return repository.findAll();
    }

    @Override
    public ProductOfferingPrice save(ProductOfferingPrice productOfferingPrice) {
        return repository.save(productOfferingPrice);
    }
}
