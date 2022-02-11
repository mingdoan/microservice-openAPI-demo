package com.example.productcatalogservice.repositories;

import com.example.productcatalogservice.models.ProductOffering;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductOfferingRepository extends MongoRepository<ProductOffering,String> {
}
