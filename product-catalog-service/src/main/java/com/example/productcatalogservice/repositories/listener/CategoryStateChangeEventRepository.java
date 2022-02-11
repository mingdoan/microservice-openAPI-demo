package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.CategoryStateChangeEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryStateChangeEventRepository extends MongoRepository<CategoryStateChangeEvent,String> {
}
