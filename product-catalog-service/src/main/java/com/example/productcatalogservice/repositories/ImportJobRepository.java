package com.example.productcatalogservice.repositories;

import com.example.productcatalogservice.models.ImportJob;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImportJobRepository extends MongoRepository<ImportJob,String> {
}
