package com.example.productcatalogservice.repositories;

import com.example.productcatalogservice.models.ProductSpecification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductSpecificationRepository extends MongoRepository<ProductSpecification,String> {
}
