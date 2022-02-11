package com.example.productcatalogservice.repositories.listener;

import com.example.productcatalogservice.models.CatalogStateChangeEvent;
import com.example.productcatalogservice.models.CategoryAttributeValueChangeEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryAttributeValueChangeEventRepository extends MongoRepository<CategoryAttributeValueChangeEvent,String> {
}
