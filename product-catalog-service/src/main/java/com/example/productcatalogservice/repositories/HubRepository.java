package com.example.productcatalogservice.repositories;

import com.example.productcatalogservice.models.EventSubscriptionInput;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HubRepository extends MongoRepository<EventSubscriptionInput,String>  {
}
