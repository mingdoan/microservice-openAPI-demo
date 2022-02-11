package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.ProductOfferingStateChangeEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductOfferingStateChangeEventRepository extends MongoRepository<ProductOfferingStateChangeEvent,String> {
}
