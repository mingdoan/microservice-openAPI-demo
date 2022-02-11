package com.example.productcatalogservice.services;

import com.example.productcatalogservice.models.ProductOffering;

import java.util.List;

public interface ProductOfferingService {
    List<ProductOffering> getAll();
    ProductOffering save(ProductOffering productOffering);
}
