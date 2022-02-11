package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.CategoryCreateEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryCreateEventRepository extends MongoRepository<CategoryCreateEvent,String> {
}
