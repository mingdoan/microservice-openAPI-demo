package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.EventSubscription;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventSubscriptionRepository extends MongoRepository<EventSubscription,String> {
}
