package com.example.productcatalogservice.repositories;

import com.example.productcatalogservice.models.Catalog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatalogRepository extends MongoRepository <Catalog,String>{

}
