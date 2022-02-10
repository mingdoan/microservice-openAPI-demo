package com.example.productcatalogservice.repositories;

import com.example.productcatalogservice.models.ExportJob;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExportJobRepository extends MongoRepository<ExportJob,String> {
}
