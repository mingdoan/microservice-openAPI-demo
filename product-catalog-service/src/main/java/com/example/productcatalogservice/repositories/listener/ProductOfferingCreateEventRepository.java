package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.ProductOfferingCreateEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductOfferingCreateEventRepository extends MongoRepository<ProductOfferingCreateEvent,String> {
}
