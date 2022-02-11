package com.example.productcatalogservice.repositories;

import com.example.productcatalogservice.models.ProductOfferingPrice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductOfferingPriceRepository extends MongoRepository<ProductOfferingPrice,String> {
}
