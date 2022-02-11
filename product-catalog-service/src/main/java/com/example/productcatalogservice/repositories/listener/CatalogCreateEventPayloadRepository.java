package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.CatalogCreateEventPayload;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatalogCreateEventPayloadRepository extends MongoRepository<CatalogCreateEventPayload,String> {
}
