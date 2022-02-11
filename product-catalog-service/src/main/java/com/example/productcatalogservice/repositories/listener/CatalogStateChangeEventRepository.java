package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.CatalogStateChangeEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatalogStateChangeEventRepository extends MongoRepository<CatalogStateChangeEvent,String> {
}
