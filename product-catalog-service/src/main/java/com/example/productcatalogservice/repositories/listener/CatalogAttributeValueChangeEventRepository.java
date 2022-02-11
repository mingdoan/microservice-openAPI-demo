package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.CatalogAttributeValueChangeEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatalogAttributeValueChangeEventRepository extends MongoRepository<CatalogAttributeValueChangeEvent,String> {
}
