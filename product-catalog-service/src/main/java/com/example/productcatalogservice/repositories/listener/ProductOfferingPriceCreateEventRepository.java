package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.ProductOfferingPriceCreateEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductOfferingPriceCreateEventRepository extends MongoRepository<ProductOfferingPriceCreateEvent,String> {
}
