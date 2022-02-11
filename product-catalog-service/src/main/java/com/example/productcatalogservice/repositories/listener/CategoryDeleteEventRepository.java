package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.CategoryDeleteEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryDeleteEventRepository extends MongoRepository<CategoryDeleteEvent,String> {
}
