package com.example.productcatalogservice.services;

import com.example.productcatalogservice.models.ProductOfferingPrice;

import java.util.List;

public interface ProductOfferingPriceService {
    List<ProductOfferingPrice> getAll();
    ProductOfferingPrice save(ProductOfferingPrice productOfferingPrice);
}
