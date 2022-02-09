package com.example.productcatalogservice.repositories;

import com.example.productcatalogservice.models.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category,String> {
}
