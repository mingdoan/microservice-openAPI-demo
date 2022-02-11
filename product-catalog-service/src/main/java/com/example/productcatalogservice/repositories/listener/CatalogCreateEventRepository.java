package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.CatalogCreateEvent;
import com.example.productcatalogservice.models.CatalogCreateEventPayload;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatalogCreateEventRepository extends MongoRepository<CatalogCreateEvent,String>  {
}
