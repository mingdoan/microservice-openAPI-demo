package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.CatalogDeleteEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatalogDeleteEventRepository extends MongoRepository<CatalogDeleteEvent,String> {
}
