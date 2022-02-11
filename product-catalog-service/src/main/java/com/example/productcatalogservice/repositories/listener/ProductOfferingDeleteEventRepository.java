package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.ProductOfferingDeleteEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductOfferingDeleteEventRepository extends MongoRepository<ProductOfferingDeleteEvent,String> {
}
