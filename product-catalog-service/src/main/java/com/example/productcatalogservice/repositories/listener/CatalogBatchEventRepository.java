package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.CatalogBatchEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatalogBatchEventRepository extends MongoRepository<CatalogBatchEvent,String> {
}
